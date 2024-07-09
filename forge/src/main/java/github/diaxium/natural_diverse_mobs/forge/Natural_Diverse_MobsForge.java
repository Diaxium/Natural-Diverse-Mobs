package github.diaxium.natural_diverse_mobs.forge;

import dev.architectury.platform.forge.EventBuses;
import github.diaxium.natural_diverse_mobs.Natural_Diverse_Mobs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Natural_Diverse_Mobs.MOD_ID)
public class Natural_Diverse_MobsForge {
    public Natural_Diverse_MobsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Natural_Diverse_Mobs.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Natural_Diverse_Mobs.init();
    }
}