package github.diaxium.natural_diverse_mobs.common.config.mobs.passive.pigs;

import com.teamresourceful.resourcefulconfig.common.annotations.Category;
import com.teamresourceful.resourcefulconfig.common.annotations.Comment;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;
import github.diaxium.natural_diverse_mobs.common.config.Ndm_Settings;

@Category(id = Pigs_Settings.ID, translation = Pigs_Settings.PREFIX)
public final class Pigs_Settings {
    public static final String ID = "pigs_settings";
    public static final String PREFIX = Ndm_Settings.PREFIX + "." + ID;

    @ConfigEntry(id = ID + "pig_diversity", type = EntryType.BOOLEAN, translation = PREFIX + ".pig_diversity")
    @Comment(value = "Enable Pig Diversity", translation = PREFIX + ".pig_diversity.comment")
    public static boolean EnableDiversity = true;

    @ConfigEntry(id = ID + "gets_muddy", type = EntryType.BOOLEAN, translation = PREFIX + ".gets_muddy")
    @Comment(value = "Enable Muddy Pigs", translation = PREFIX + ".gets_muddy.comment")
    public static boolean EnableMuddyPigs = true;

    @ConfigEntry(id = ID + "gets_slushy", type = EntryType.BOOLEAN, translation = PREFIX + ".gets_slushy")
    @Comment(value = "Enable Slushy Pigs", translation = PREFIX + ".gets_slushy.comment")
    public static boolean EnableSlushyPigs = true;

    @ConfigEntry(id = ID + "gets_dusty", type = EntryType.BOOLEAN, translation = PREFIX + ".gets_dusty")
    @Comment(value = "Enable Dusty Pigs", translation = PREFIX + ".gets_dusty.comment")
    public static boolean EnableDustyPigs = true;

    @ConfigEntry(id = ID + "gets_scorched", type = EntryType.BOOLEAN, translation = PREFIX + ".gets_scorched")
    @Comment(value = "Enable Scorched Pigs", translation = PREFIX + ".gets_scorched.comment")
    public static boolean EnableScorchedPigs = true;

    @ConfigEntry(id = ID + "domesticated_pigs", type = EntryType.BOOLEAN, translation = PREFIX + ".domesticated_pigs")
    @Comment(value = "Enable Domesticated Pigs", translation = PREFIX + ".domesticated_pigs.comment")
    public static boolean EnableDomesticatedPigs = true;

    @ConfigEntry(id = ID + "domestication_level", type = EntryType.ENUM, translation = PREFIX + ".domestication_level")
    @Comment(value = "Domestication Level", translation = PREFIX + ".domestication_level.comment")
    public static DomesticationLevels domesticationLevel = DomesticationLevels.FARM;
}
