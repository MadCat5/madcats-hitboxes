package madcats_hitboxes;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "ClothConfig")
public class ModConfig implements ConfigData {
    public boolean Enabled = true;
    public boolean ShowSelf = true;
    @ConfigEntry.Gui.CollapsibleObject
    public playerHitbox playerOption = new playerHitbox();

    public static class playerHitbox {
        public boolean showElytra = true;
        public boolean showSwimming = true;
        public boolean showSneaking = true;
        public boolean showStanding = true;
        public boolean showSleeping = true;
    }

    @ConfigEntry.Gui.CollapsibleObject
    public Mobs mobsOption = new Mobs();

    public static class Mobs {
        @ConfigEntry.Gui.CollapsibleObject
        public Passive passive = new Passive();
        public  static class Passive {
            public boolean allay = true;
            public boolean armadillo = true;
            public boolean axolotl = true;
            public boolean bat = true;
            public boolean bee = true;
            public boolean camel = true;
            public boolean cat = true;
            public boolean chicken = true;
            public boolean cod = true;
            public boolean cow = true;
            public boolean dolphin = true;
            public boolean donkey = true;
            public boolean fox = true;
            public boolean frog = true;
            public boolean glowSquid = true;
            public boolean goat = true;
            public boolean horse = true;
            public boolean llama = true;
            public boolean mooshroom = true;
            public boolean mule = true;
            public boolean ocelot = true;
            public boolean parrot = true;
            public boolean panda = true;
            public boolean polarBear = true;
            public boolean pig = true;
            public boolean pufferfish = true;
            public boolean rabbit = true;
            public boolean salmon = true;
            public boolean sheep = true;
            public boolean skellyHorse = true;
            public boolean sniffer = true;
            public boolean snowGolem = true;
            public boolean squid = true;
            public boolean strider = true;
            public boolean tadpole = true;
            public boolean tropicalFish = true;
            public boolean turtle = true;
            public boolean villager = true;
            public boolean wanderingTrader = true;
            public boolean wolf = true;
            public boolean ironGolem =true;
        }
        @ConfigEntry.Gui.CollapsibleObject
        public Hostile hostile = new Hostile();
        public  static class Hostile {
            public boolean blaze = true;
            public boolean caveSpider = true;
            public boolean creeper = true;
            public boolean drowned = true;
            public boolean elderGuardian = true;
            public boolean enderman = true;
            public boolean endermite = true;
            public boolean evoker = true;
            public boolean ghast = true;
            public boolean guardian = true;
            public boolean hoglin = true;
            public boolean husk = true;
            public boolean magmaCube = true;
            public boolean phantom = true;
            public boolean piglin = true;
            public boolean piglinBrute = true;
            public boolean pillager = true;
            public boolean ravager = true;
            public boolean shulker = true;
            public boolean silverfish = true;
            public boolean skeleton = true;
            public boolean slime = true;
            public boolean spider = true;
            public boolean stray = true;
            public boolean vex = true;
            public boolean vindicator = true;
            public boolean warden = true;
            public boolean witch = true;
            public boolean witherSkeleton = true;
            public boolean zoglin = true;
            public boolean zombie = true;
            public boolean zombieVillager = true;
            public boolean zombiePiglin = true;

        }
        @ConfigEntry.Gui.CollapsibleObject
        public Boss boss = new Boss();
        public  static class Boss {
            public boolean dragon = true;
            public boolean wither = true;
        }
        @ConfigEntry.Gui.CollapsibleObject
        public Unused unused = new Unused();
        public  static class Unused {
            public boolean giant = true;
            public boolean illusioner = true;
            public boolean zombieHorse = true;
        }

        @ConfigEntry.Gui.CollapsibleObject
        public Babies baby = new Babies();
        public static class Babies {
            public boolean drowned = true;
            public boolean hoglin = true;
            public boolean husk = true;
            public boolean piglin = true;
            public boolean zoglin = true;
            public boolean zombie = true;
            public boolean zombiePiglin = true;
            public boolean zombieVillager = true;
        }


    }

    @ConfigEntry.Gui.CollapsibleObject
    public Projectiles projectilesOption = new Projectiles();
    public static class Projectiles {
        public boolean arrow = true;
        public boolean bottleXP = true;
        public boolean egg = true;
        public boolean enderPearl = true;
        public boolean enderEye = true;
        public boolean fireball = true;
        public boolean smallFireball = true;
        public boolean fireworkRocket = true;
        public boolean snowball = true;
        public boolean splashPotion = true;
        public boolean trident = true;
        public boolean witherSkull = true;
        public boolean shulkerBullet = true;
        public boolean fishingBobber = true;
        public boolean llamaSpit = true;
    }

    @ConfigEntry.Gui.CollapsibleObject
    public Other othersOption = new Other();
    public static class Other {
        public boolean evokerFangs = true;
        public boolean item = true;
        public boolean fallingBlocks = true;
        public boolean armorStand = true;
        public boolean boat = true;
        public boolean endCrystal = true;
        public boolean experience = true;
        public boolean itemFrame = true;
        public boolean minecart = true;
        public boolean tnt = true;
    }

    @ConfigEntry.Gui.CollapsibleObject
    public Invisible invisibleOption = new Invisible();
    public static class Invisible {
        public boolean display = true;
        public boolean interaction = true;
    }

    @ConfigEntry.Gui.CollapsibleObject
    public Vector vector = new Vector();
    public static class Vector {
        public boolean player = true;
        public boolean item = true;
        public boolean boat = true;
        public boolean endCrystal = true;
        public boolean experience = true;
        public boolean itemFrame = true;
        public boolean minecart = true;
        public boolean projectile = true;
        public boolean hostileMob = true;
        public boolean passiveMob = true;
        public boolean wither = true;
        public boolean enderDragon = true;
    }


}