package github.diaxium.natural_diverse_mobs.common.config.mobs.passive.pigs;

public enum DomesticationLevels {
    WILD(0, "Wild"),
    TAME(1, "Tame"),
    FARM(2, "Farm");

    private final int value;
    private final String name;

    DomesticationLevels(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
