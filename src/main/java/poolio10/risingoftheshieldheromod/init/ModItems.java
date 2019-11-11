package poolio10.risingoftheshieldheromod.init;

import net.minecraft.creativetab.CreativeTabs;
import poolio10.risingoftheshieldheromod.RisingoftheShieldHeroMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(RisingoftheShieldHeroMod.MODID)
public class ModItems {
    public static final Item ZOMBIE_DRAGON_STONE = null;

    @EventBusSubscriber(modid = RisingoftheShieldHeroMod.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(RisingoftheShieldHeroMod.MODID, "zombie_dragon_stone").setTranslationKey(RisingoftheShieldHeroMod.MODID + "." + "zombie_dragon_stone").setCreativeTab(CreativeTabs.MISC)
            };

            event.getRegistry().registerAll(items);
        }

    }

}