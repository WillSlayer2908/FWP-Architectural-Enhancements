package com.forgewolfproductions.fwparchitecturalenhancements.block.ExteriorDeco;

import com.forgewolfproductions.fwparchitecturalenhancements.Elements;
import com.forgewolfproductions.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@Elements.ModElement.Tag
public class BlockBasicCyanGlassTinted extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:basic_cyan_glass_tinted")
    public static final Block block = null;

    public BlockBasicCyanGlassTinted(Elements instance) {
        super(instance, 836);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("basic_cyan_glass_tinted"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation("fwparchitecturalenhancements:basic_cyan_glass_tinted", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.GLASS);
            setUnlocalizedName("basic_cyan_glass_tinted");
            setSoundType(SoundType.GLASS);
            setHarvestLevel("pickaxe", 1);
            setHardness(1F);
            setResistance(10F);
            setLightLevel(0.05F);
            setLightOpacity(42);
            setCreativeTab(TabArchitecturalEnhancements.ExteriorDeco);
        }

        @Override
        public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
            super.addInformation(itemstack, world, list, flag);
            list.add("Use with skyscraper block");
        }

        @SideOnly(Side.CLIENT)
        @Override
        public BlockRenderLayer getBlockLayer() {
            return BlockRenderLayer.TRANSLUCENT;
        }

        @Override
        public boolean isOpaqueCube(IBlockState state) {
            return false;
        }
    }
}
