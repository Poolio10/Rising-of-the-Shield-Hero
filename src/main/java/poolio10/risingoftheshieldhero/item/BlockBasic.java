package poolio10.risingoftheshieldhero.item;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import poolio10.risingoftheshieldhero.RisingoftheShieldHero;
import poolio10.risingoftheshieldhero.tabs.ShieldHeroTab;

public class BlockBasic extends Block {

    public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);
    }

    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(RisingoftheShieldHero.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(RisingoftheShieldHero.Shield_Hero_Tab);
        setSoundType(sound);
    }

}