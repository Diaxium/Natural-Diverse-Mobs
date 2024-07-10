package github.diaxium.natural_diverse_mobs.fabric.integration.modmenu;

import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.teamresourceful.resourcefulconfig.common.config.ResourcefulConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import github.diaxium.natural_diverse_mobs.Natural_Diverse_Mobs;
import github.diaxium.natural_diverse_mobs.common.config.Ndm_Settings;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Modmenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        ResourcefulConfig config = Natural_Diverse_Mobs.CONFIGURATOR.getConfig(Ndm_Settings.class);

        return config != null ?
                Screen -> new ConfigScreen(Screen, null, config) : null;
    }
}
