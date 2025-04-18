package madcats_hitboxes.mixin.client;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.decoration.*;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.projectile.thrown.*;
import net.minecraft.entity.vehicle.*;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import madcats_hitboxes.ModConfig;
import madcats_hitboxes.configAccess;


@Mixin(value = EntityRenderDispatcher.class, priority = 10)
public class renderHitboxMixin {
	@Unique
	private static final ModConfig config = configAccess.config;
	@Unique
	private static Entity tempEntity;

	@Inject(at = @At("HEAD"), method = "renderHitbox", cancellable = true)
	private static void cond(MatrixStack matrices, VertexConsumer vertices, Entity entity, float tickDelta, float red, float green, float blue, CallbackInfo ci) {

		if (config.Enabled) {
			tempEntity = entity;

			if (entity instanceof PlayerEntity player) {
				if (player == MinecraftClient.getInstance().player){if (!config.ShowSelf){ci.cancel();}}
				if (player.isFallFlying()) {if (!config.playerOption.showElytra) {ci.cancel();}
				} else if (player.isSwimming() || player.isCrawling()) {if (!config.playerOption.showSwimming) {ci.cancel();}
				} else if (player.isSneaking()) {if (!config.playerOption.showSneaking) {ci.cancel();}
				} else if (player.isSleeping()) {if (!config.playerOption.showSleeping) {ci.cancel();}
				} else if (!config.playerOption.showStanding) {ci.cancel();}
			}

			if (entity instanceof MobEntity mob) {

				/// Passive Mobs
				if (mob instanceof AllayEntity) {if (!config.mobsOption.passive.allay) {ci.cancel();}}
				if (mob instanceof ArmadilloEntity) {if (!config.mobsOption.passive.armadillo) {ci.cancel();}}
				if (mob instanceof AxolotlEntity) {if (!config.mobsOption.passive.axolotl) {ci.cancel();}}
				if (mob instanceof BatEntity) {if (!config.mobsOption.passive.bat) {ci.cancel();}}
				if (mob instanceof BeeEntity) {if (!config.mobsOption.passive.bee) {ci.cancel();}}
				if (mob instanceof CamelEntity) {if (!config.mobsOption.passive.camel) {ci.cancel();}}
				if (mob instanceof CatEntity) {if (!config.mobsOption.passive.cat) {ci.cancel();}}
				if (mob instanceof ChickenEntity) {if (!config.mobsOption.passive.chicken) {ci.cancel();}}
				if (mob instanceof CodEntity) {if (!config.mobsOption.passive.cod) {ci.cancel();}}
				if (mob instanceof CowEntity) {if (!config.mobsOption.passive.cow) {ci.cancel();}}
				if (mob instanceof DolphinEntity) {if (!config.mobsOption.passive.dolphin) {ci.cancel();}}
				if (mob instanceof DonkeyEntity) {if (!config.mobsOption.passive.donkey) {ci.cancel();}}
				if (mob instanceof FoxEntity) {if (!config.mobsOption.passive.fox) {ci.cancel();}}
				if (mob instanceof FrogEntity) {if (!config.mobsOption.passive.frog) {ci.cancel();}}
				if (mob instanceof GlowSquidEntity) {if (!config.mobsOption.passive.glowSquid) {ci.cancel();}}
				if (mob instanceof GoatEntity) {if (!config.mobsOption.passive.goat) {ci.cancel();}}
				if (mob instanceof HorseEntity) {if (!config.mobsOption.passive.horse) {ci.cancel();}}
				if (mob instanceof IronGolemEntity) {if (!config.mobsOption.passive.ironGolem) {ci.cancel();}}
				if (mob instanceof LlamaEntity || mob instanceof TraderLlamaEntity) {if (!config.mobsOption.passive.llama) {ci.cancel();}}
				if (mob instanceof MooshroomEntity) {if (!config.mobsOption.passive.mooshroom) {ci.cancel();}}
				if (mob instanceof MuleEntity) {if (!config.mobsOption.passive.mule) {ci.cancel();}}
				if (mob instanceof OcelotEntity) {if (!config.mobsOption.passive.ocelot) {ci.cancel();}}
				if (mob instanceof ParrotEntity) {if (!config.mobsOption.passive.parrot) {ci.cancel();}}
				if (mob instanceof PandaEntity) {if (!config.mobsOption.passive.panda) {ci.cancel();}}
				if (mob instanceof PolarBearEntity) {if (!config.mobsOption.passive.polarBear) {ci.cancel();}}
				if (mob instanceof PigEntity) {if (!config.mobsOption.passive.pig) {ci.cancel();}}
				if (mob instanceof PufferfishEntity) {if (!config.mobsOption.passive.pufferfish) {ci.cancel();}}
				if (mob instanceof RabbitEntity) {if (!config.mobsOption.passive.rabbit) {ci.cancel();}}
				if (mob instanceof SalmonEntity) {if (!config.mobsOption.passive.salmon) {ci.cancel();}}
				if (mob instanceof SheepEntity) {if (!config.mobsOption.passive.sheep) {ci.cancel();}}
				if (mob instanceof SkeletonHorseEntity) {if (!config.mobsOption.passive.skellyHorse) {ci.cancel();}}
				if (mob instanceof SnifferEntity) {if (!config.mobsOption.passive.sniffer) {ci.cancel();}}
				if (mob instanceof SnowGolemEntity) {if (!config.mobsOption.passive.snowGolem) {ci.cancel();}}
				if (mob instanceof SquidEntity && !(mob instanceof GlowSquidEntity)) {if (!config.mobsOption.passive.squid) {ci.cancel();}}
				if (mob instanceof StriderEntity) {if (!config.mobsOption.passive.strider) {ci.cancel();}}
				if (mob instanceof TadpoleEntity) {if (!config.mobsOption.passive.tadpole) {ci.cancel();}}
				if (mob instanceof TropicalFishEntity) {if (!config.mobsOption.passive.tropicalFish) {ci.cancel();}}
				if (mob instanceof TurtleEntity) {if (!config.mobsOption.passive.turtle) {ci.cancel();}}
				if (mob instanceof VillagerEntity) {if (!config.mobsOption.passive.villager) {ci.cancel();}}
				if (mob instanceof WanderingTraderEntity) {if (!config.mobsOption.passive.wanderingTrader) {ci.cancel();}}
				if (mob instanceof WolfEntity) {if (!config.mobsOption.passive.wolf) {ci.cancel();}}

				/// Hostile Mobs
				if (mob instanceof BlazeEntity) {if (!config.mobsOption.hostile.blaze) {ci.cancel();}}
				if (mob instanceof BoggedEntity) {if (!config.mobsOption.hostile.bogged) {ci.cancel();}}
				if (mob instanceof BreezeEntity) {if (!config.mobsOption.hostile.breeze) {ci.cancel();}}
				if (mob instanceof CaveSpiderEntity) {if (!config.mobsOption.hostile.caveSpider) {ci.cancel();}}
				if (mob instanceof CreeperEntity) {if (!config.mobsOption.hostile.creeper) {ci.cancel();}}
				if (mob instanceof DrownedEntity) {
					if (mob.isBaby()) {if (!config.mobsOption.baby.drowned) {ci.cancel();}} else if (!config.mobsOption.hostile.drowned) {ci.cancel();}}
				if (mob instanceof ElderGuardianEntity) {if (!config.mobsOption.hostile.elderGuardian) {ci.cancel();}}
				if (mob instanceof EndermanEntity) {if (config.mobsOption.hostile.enderman) {ci.cancel();}}
				if (mob instanceof EndermiteEntity) {if (!config.mobsOption.hostile.endermite) {ci.cancel();}}
				if (mob instanceof EvokerEntity) {if (!config.mobsOption.hostile.evoker) {ci.cancel();}}
				if (mob instanceof GhastEntity) {if (!config.mobsOption.hostile.ghast) {ci.cancel();}}
				if (mob instanceof GuardianEntity) {if (!config.mobsOption.hostile.guardian) {ci.cancel();}}
				if (mob instanceof HoglinEntity) {
					if (mob.isBaby()) {if (!config.mobsOption.baby.hoglin) {ci.cancel();}} else if (!config.mobsOption.hostile.hoglin) {ci.cancel();}}
				if (mob instanceof HuskEntity) {
					if (mob.isBaby()) {if (!config.mobsOption.baby.husk) {ci.cancel();}} else if (!config.mobsOption.hostile.husk) {ci.cancel();}}
				if (mob instanceof MagmaCubeEntity) {if (!config.mobsOption.hostile.magmaCube) {ci.cancel();}}
				if (mob instanceof PhantomEntity) {if (!config.mobsOption.hostile.phantom) {ci.cancel();}}
				if (mob instanceof PiglinEntity) {
					if (mob.isBaby()) {if (!config.mobsOption.baby.piglin) {ci.cancel();}} else if (!config.mobsOption.hostile.piglin) {ci.cancel();}}
				if (mob instanceof PiglinBruteEntity) {if (!config.mobsOption.hostile.piglinBrute) {ci.cancel();}}
				if (mob instanceof PillagerEntity) {if (!config.mobsOption.hostile.pillager) {ci.cancel();}}
				if (mob instanceof RavagerEntity) {if (!config.mobsOption.hostile.ravager) {ci.cancel();}}
				if (mob instanceof ShulkerEntity) {if (!config.mobsOption.hostile.shulker) {ci.cancel();}}
				if (mob instanceof SilverfishEntity) {if (!config.mobsOption.hostile.silverfish) {ci.cancel();}}
				if (mob instanceof SkeletonEntity) {if (!config.mobsOption.hostile.skeleton) {ci.cancel();}}
				if (mob instanceof SlimeEntity) {if (config.mobsOption.hostile.slime) {ci.cancel();}}
				if (mob instanceof SpiderEntity) {if (!config.mobsOption.hostile.spider) {ci.cancel();}}
				if (mob instanceof StrayEntity) {if (!config.mobsOption.hostile.stray) {ci.cancel();}}
				if (mob instanceof VexEntity) {if (!config.mobsOption.hostile.vex) {ci.cancel();}}
				if (mob instanceof VindicatorEntity) {if (!config.mobsOption.hostile.vindicator) {ci.cancel();}}
				if (mob instanceof WardenEntity) {if (!config.mobsOption.hostile.warden) {ci.cancel();}}
				if (mob instanceof WitchEntity) {if (!config.mobsOption.hostile.witch) {ci.cancel();}}
				if (mob instanceof WitherSkeletonEntity) {if (!config.mobsOption.hostile.witherSkeleton) {ci.cancel();}}
				if (mob instanceof ZoglinEntity) {
					if (mob.isBaby()) {
						if (!config.mobsOption.baby.zoglin) {ci.cancel();}} else if (!config.mobsOption.hostile.zoglin) {ci.cancel();}}
				if (mob instanceof ZombieEntity && !(mob instanceof ZombifiedPiglinEntity || mob instanceof DrownedEntity || mob instanceof HuskEntity || mob instanceof ZombieVillagerEntity)) {
					if (mob.isBaby()) {
						if (!config.mobsOption.baby.zombie) {ci.cancel();}} else if (!config.mobsOption.hostile.zombie) {ci.cancel();}}
				if (mob instanceof ZombifiedPiglinEntity) {
					if (mob.isBaby()) {
						if (!config.mobsOption.baby.zombiePiglin) {ci.cancel();}} else if (!config.mobsOption.hostile.zombiePiglin) {ci.cancel();}}
				if (mob instanceof ZombieVillagerEntity) {
					if (mob.isBaby()) {if (!config.mobsOption.baby.zombieVillager) {ci.cancel();}} else if (!config.mobsOption.hostile.zombieVillager) {ci.cancel();}}

				/// Boss mobs
				if (mob instanceof EnderDragonEntity) {if (!config.mobsOption.boss.dragon) {ci.cancel();}}
				if (mob instanceof WitherEntity) {if (!config.mobsOption.boss.wither) {ci.cancel();}}

				/// Unused Mobs
				if (mob instanceof GiantEntity) {if (!config.mobsOption.unused.giant) {ci.cancel();}}
				if (mob instanceof IllusionerEntity) {if (!config.mobsOption.unused.illusioner) {ci.cancel();}}
				if (mob instanceof ZombieHorseEntity) {if (!config.mobsOption.unused.zombieHorse) {ci.cancel();}}
			}

			/// projectiles
			if (entity instanceof ProjectileEntity projectile) {
				if (projectile instanceof ArrowEntity || projectile instanceof SpectralArrowEntity) {if (!config.projectilesOption.arrow) {ci.cancel();}}
				if (projectile instanceof ExperienceBottleEntity) {if (!config.projectilesOption.bottleXP) {ci.cancel();}}
				if (projectile instanceof EggEntity) {if (!config.projectilesOption.egg) {ci.cancel();}}
				if (projectile instanceof EnderPearlEntity) {if (!config.projectilesOption.enderPearl) {ci.cancel();}}
				if (projectile instanceof FireballEntity) {if (!config.projectilesOption.fireball) {ci.cancel();}}
				if (projectile instanceof SmallFireballEntity) {if (!config.projectilesOption.smallFireball) {ci.cancel();}}
				if (projectile instanceof FireworkRocketEntity) {if (!config.projectilesOption.fireworkRocket) {ci.cancel();}}
				if (projectile instanceof SnowballEntity) {if (!config.projectilesOption.snowball) {ci.cancel();}}
				if (projectile instanceof PotionEntity) {if (!config.projectilesOption.splashPotion) {ci.cancel();}}
				if (projectile instanceof TridentEntity) {if (!config.projectilesOption.trident) {ci.cancel();}}
				if (projectile instanceof WindChargeEntity) {if (!config.projectilesOption.windCharge) {ci.cancel();}}
				if (entity instanceof WitherSkullEntity) {if (!config.projectilesOption.witherSkull) {ci.cancel();}}
				if (entity instanceof ShulkerBulletEntity) {if (!config.projectilesOption.shulkerBullet) {ci.cancel();}}
				if (entity instanceof FishingBobberEntity) {if (!config.projectilesOption.fishingBobber) {ci.cancel();}}
				if (entity instanceof LlamaSpitEntity) {if (!config.projectilesOption.llamaSpit) {ci.cancel();}}
			}
			if (entity instanceof EyeOfEnderEntity) {if (!config.projectilesOption.enderEye) {ci.cancel();}} // not a projectile

			/// others
			if (entity instanceof EvokerFangsEntity) {if (!config.othersOption.evokerFangs) {ci.cancel();}}
			if (entity instanceof OminousItemSpawnerEntity) {if (!config.othersOption.ominousItemSpawner) {ci.cancel();}}
			if (entity instanceof ItemEntity) {if (!config.othersOption.item) {ci.cancel();}}
			if (entity instanceof FallingBlockEntity) {if (!config.othersOption.fallingBlocks) {ci.cancel();}}
			if (entity instanceof ArmorStandEntity) {if (!config.othersOption.armorStand) {ci.cancel();}}
			if (entity instanceof BoatEntity || entity instanceof ChestBoatEntity) {if (!config.othersOption.boat) {ci.cancel();}}
			if (entity instanceof EndCrystalEntity) {if (!config.othersOption.endCrystal) {ci.cancel();}}
			if (entity instanceof ExperienceOrbEntity) {if (!config.othersOption.experience) {ci.cancel();}}
			if (entity instanceof ItemFrameEntity || entity instanceof GlowItemFrameEntity) {if (!config.othersOption.itemFrame) {ci.cancel();}}
			if (entity instanceof AbstractMinecartEntity) {if (!config.othersOption.minecart) {ci.cancel();}}
			if (entity instanceof TntEntity) {if (!config.othersOption.tnt) {ci.cancel();}}


			/// invisible
			if (entity instanceof DisplayEntity) {if (!config.invisibleOption.display) {ci.cancel();}}
			if (entity instanceof InteractionEntity) {if (!config.invisibleOption.interaction) {ci.cancel();}}

		}
	}



		@WrapWithCondition(
				method = "renderHitbox",
				at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EntityRenderDispatcher;drawVector(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lorg/joml/Vector3f;Lnet/minecraft/util/math/Vec3d;I)V"))

		private static boolean shouldDrawVector(MatrixStack matrices, VertexConsumer vertexConsumers, Vector3f offset, Vec3d vec, int color) {
			if (config.Enabled) {
				if (tempEntity instanceof PlayerEntity && config.vector.player) {return true;}
				if (tempEntity instanceof ItemEntity && config.vector.item) {return true;}
				if ((tempEntity instanceof BoatEntity || tempEntity instanceof ChestBoatEntity) && config.vector.boat) {return true;}
				if (tempEntity instanceof EndCrystalEntity && config.vector.endCrystal) {return true;}
				if (tempEntity instanceof ExperienceOrbEntity && config.vector.experience) {return true;}
				if (tempEntity instanceof ItemFrameEntity && config.vector.itemFrame) {return true;}
				if (tempEntity instanceof AbstractMinecartEntity && config.vector.minecart) {return true;}
				if (tempEntity instanceof ProjectileEntity && config.vector.projectile) {return true;}
				if (tempEntity instanceof HostileEntity && config.vector.hostileMob) {return true;}
				if (tempEntity instanceof PassiveEntity && config.vector.passiveMob) {return true;}
				if (tempEntity instanceof WitherEntity && config.vector.wither) {return true;}
				if (tempEntity instanceof EnderDragonEntity && config.vector.enderDragon) {return true;}
				return false;
				}
			return true;
		}



}