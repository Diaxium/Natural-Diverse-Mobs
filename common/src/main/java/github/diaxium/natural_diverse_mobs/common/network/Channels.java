package github.diaxium.natural_diverse_mobs.common.network;

import com.teamresourceful.resourcefullib.common.network.NetworkChannel;
import github.diaxium.natural_diverse_mobs.Natural_Diverse_Mobs;

@SuppressWarnings("UnstableApiUsage")
public class Channels {
    public static final int PROTOCOL_VERSION = 1;
    public static final NetworkChannel NETWORK_CHANNEL = new NetworkChannel(Natural_Diverse_Mobs.MOD_ID, PROTOCOL_VERSION, "global");

    public static void init() {

    }
}
