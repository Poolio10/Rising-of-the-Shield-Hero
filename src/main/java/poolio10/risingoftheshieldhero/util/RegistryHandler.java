package poolio10.risingoftheshieldhero.util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import poolio10.risingoftheshieldhero.item.BlockBasic;
import poolio10.risingoftheshieldhero.item.ItemBasic;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemBasic("itemBasic", "basic_item"),
        };

        final Item[] itemBlocks = {

        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}