package poolio10.risingoftheshieldhero.item;

import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic(String unlocalizedName, String registryName){
        setUnlocalizedName(RisingoftheShieldHero.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
    }
}
