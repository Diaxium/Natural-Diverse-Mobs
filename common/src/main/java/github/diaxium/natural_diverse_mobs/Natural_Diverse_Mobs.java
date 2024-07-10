package github.diaxium.natural_diverse_mobs;

import com.mojang.logging.LogUtils;
import com.teamresourceful.resourcefulconfig.common.config.Configurator;
import github.diaxium.natural_diverse_mobs.common.config.Ndm_Settings;
import org.slf4j.Logger;

public class Natural_Diverse_Mobs
{
	public static final String MOD_ID = "natural_diverse_mobs";
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final Configurator CONFIGURATOR = new Configurator();

	public static void init() {
		CONFIGURATOR.registerConfig(Ndm_Settings.class);
	}
}
