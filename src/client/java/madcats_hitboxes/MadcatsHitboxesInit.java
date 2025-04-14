package madcats_hitboxes;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;


public class MadcatsHitboxesInit implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
	}
}