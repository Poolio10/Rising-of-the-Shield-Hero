package poolio10.risingoftheshieldheromod.client;

import poolio10.risingoftheshieldheromod.RisingoftheShieldHeroMod;
import poolio10.risingoftheshieldheromod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = RisingoftheShieldHeroMod.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.ZOMBIE_DRAGON_STONE, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}