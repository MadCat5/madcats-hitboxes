package view_elytra_hitbox;

import me.shedaniel.autoconfig.AutoConfig;

public class configAccess {
    public static ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

    public static void updateConfig() {
        config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }


}
