package poolio10.risingoftheshieldhero.init;

import net.minecraft.creativetab.CreativeTabs;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(RisingoftheShieldHero.MODID)
public class ModItems {
    public static final Item ZOMBIE_DRAGON_STONE = null;

    @EventBusSubscriber(modid = RisingoftheShieldHero.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(RisingoftheShieldHero.MODID, "zombie_dragon_stone").setUnlocalizedName(RisingoftheShieldHero.MODID + "." + "zombie_dragon_stone").setCreativeTab(CreativeTabs.MISC)
            };

            event.getRegistry().registerAll(items);
        }

    }

}