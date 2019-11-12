package poolio10.risingoftheshieldhero.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import poolio10.risingoftheshieldhero.init.ModItems;

public class ShieldHeroTab extends CreativeTabs {

    public ShieldHeroTab(String name) {
        super(RisingoftheShieldHero.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ZOMBIE_DRAGON_STONE);
    }

}