package net.fwparchitecturalenhancements.block.ExteriorDeco;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.creativetab.CreativeTabExteriorDeco;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Elements.ModElement.Tag
public class BlockEuroWallWhiteOpenBottom extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:euro_wall_white_open_bottom")
    public static final Block block = null;

    public BlockEuroWallWhiteOpenBottom(Elements instance) {
        super(instance, 784);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("euro_wall_white_open_bottom"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation("fwparchitecturalenhancements:euro_wall_white_open_bottom", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.ROCK);
            setUnlocalizedName("euro_wall_white_open_bottom");
            setSoundType(SoundType.STONE);
            setHarvestLevel("pickaxe", 1);
            setHardness(1F);
            setResistance(10F);
            setLightLevel(0F);
            setLightOpacity(0);
            setCreativeTab(CreativeTabExteriorDeco.ExteriorDeco);
        }

        @Override
        public boolean isOpaqueCube(IBlockState state) {
            return false;
        }
    }
}
