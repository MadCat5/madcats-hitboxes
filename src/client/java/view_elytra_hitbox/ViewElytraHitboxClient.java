package view_elytra_hitbox;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;


public class  ViewElytraHitboxClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
		ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
	}
}