package github.diaxium.natural_diverse_mobs.forge.client.modmenu;


import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import github.diaxium.natural_diverse_mobs.Natural_Diverse_Mobs;
import github.diaxium.natural_diverse_mobs.common.config.Ndm_Settings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Natural_Diverse_Mobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Modmenu {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        event.enqueueWork(() -> ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> new ConfigScreenHandler.ConfigScreenFactory((minecraft, parent) -> new ConfigScreen(parent, null, Natural_Diverse_Mobs.CONFIGURATOR.getConfig(Ndm_Settings.class)))));
    }
}
