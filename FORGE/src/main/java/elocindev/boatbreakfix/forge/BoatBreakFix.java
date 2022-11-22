package elocindev.boatbreakfix.forge;

import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.fml.common.Mod;

@Mod("boatbreakfix")
public class BoatBreakFix
{
    // private static final Logger LOGGER = LogUtils.getLogger();

    public BoatBreakFix()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
