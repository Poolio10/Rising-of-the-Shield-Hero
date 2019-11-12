package poolio10.risingoftheshieldhero.client;

import net.minecraftforge.event.RegistryEvent;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import poolio10.risingoftheshieldhero.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import poolio10.risingoftheshieldhero.util.Modeler;

@EventBusSubscriber(value = Side.CLIENT, modid = RisingoftheShieldHero.MODID)
public class ModelRegistrationHandler {

    public static void registerItemRenderer(Item item, int meta, String id) {}

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ModItems.ITEMS)
        {
            if(item instanceof Modeler)
            {
                ((Modeler)item).registerModels();
            }
        }
    }
}