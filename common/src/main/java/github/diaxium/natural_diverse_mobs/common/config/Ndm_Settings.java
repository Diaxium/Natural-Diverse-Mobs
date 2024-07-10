package github.diaxium.natural_diverse_mobs.common.config;

import com.teamresourceful.resourcefulconfig.common.annotations.Config;
import com.teamresourceful.resourcefulconfig.common.annotations.InlineCategory;
import com.teamresourceful.resourcefulconfig.web.annotations.Link;
import com.teamresourceful.resourcefulconfig.web.annotations.WebInfo;
import github.diaxium.natural_diverse_mobs.Natural_Diverse_Mobs;
import github.diaxium.natural_diverse_mobs.common.config.mobs.passive.pigs.Pigs_Settings;

@WebInfo(
        title = "Natural Diverse Mobs",
        description = "Natural Diverse Mobs is a Minecraft mod that builds upon the foundations of \"More Mob Variants\" (CC0 1.0 Universal), expanding and enhancing the concept of diverse mob variants. This mod adds fresh features to mobs, including dynamic skin colors and environmental interactions.",
        links = {
                @Link(
                        value = "https://github.com/Diaxium/Natural-Diverse-Mobs",
                        icon = "github",
                        title = "Github"
                )
        }
)
@Config(Ndm_Settings.ID)
public final class Ndm_Settings {
    public static final String ID = Natural_Diverse_Mobs.MOD_ID;
    public static final String PREFIX = "settings." + Ndm_Settings.ID;

    @InlineCategory
    public static Pigs_Settings pig_settings;
}
