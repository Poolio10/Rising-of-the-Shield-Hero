package poolio10.risingoftheshieldhero;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RisingoftheShieldHero.MODID, name = RisingoftheShieldHero.NAME, version = RisingoftheShieldHero.VERSION, acceptedMinecraftVersions = RisingoftheShieldHero.MC_VERSION)
public class RisingoftheShieldHero {

    public static final String MODID = "risingoftheshieldhero";
    static final String NAME = "Rising of the Shield Hero";
    static final String VERSION = "1.0.0";
    static final String MC_VERSION = "[1.12.2]";

    private static final Logger LOGGER = LogManager.getLogger(RisingoftheShieldHero.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(RisingoftheShieldHero.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}