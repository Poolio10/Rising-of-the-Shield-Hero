package poolio10.risingoftheshieldhero.init;

import net.minecraft.creativetab.CreativeTabs;
import poolio10.risingoftheshieldhero.items.ItemBase;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@ObjectHolder(RisingoftheShieldHero.MODID)
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item ZOMBIE_DRAGON_STONE = new ItemBase("zombie_dragon_stone");
    }