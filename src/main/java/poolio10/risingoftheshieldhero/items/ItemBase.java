package poolio10.risingoftheshieldhero.items;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import poolio10.risingoftheshieldhero.client.ModelRegistrationHandler;
import poolio10.risingoftheshieldhero.init.ModItems;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import poolio10.risingoftheshieldhero.util.Modeler;

public class ItemBase extends Item implements Modeler {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ModelRegistrationHandler.registerItemRenderer (this, 0, "inventory");
    }
}
