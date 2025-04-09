//package name.modid;
//
//import com.terraformersmc.modmenu.api.ConfigScreenFactory;
//import com.terraformersmc.modmenu.api.ModMenuApi;
//import me.shedaniel.clothconfig2.api.ConfigBuilder;
//import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
//import net.minecraft.client.gui.screen.Screen;
//import net.minecraft.text.Text;
//
//public class ModMenuSettings implements ModMenuApi {
//
//    @Override
//    public ConfigScreenFactory<?> getModConfigScreenFactory() {
//        return parent -> {
//            ConfigBuilder builder = ConfigBuilder.create()
//                    .setParentScreen(parent)
//                    .setTitle(Text.of("View Elytra Hitbox"));
//
//            ConfigEntryBuilder entryBuilder = builder.entryBuilder();
//            builder.setSavingRunnable(() -> {
//
//            });
//            Screen screen = builder.build();
//            return screen;
//
//        };
//    }
//}
