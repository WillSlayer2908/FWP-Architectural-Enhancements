package com.forgewolfproductions.fwparchitecturalenhancements.block.ExteriorDeco;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import com.forgewolfproductions.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import com.forgewolfproductions.fwparchitecturalenhancements.Elements;

@Elements.ModElement.Tag
public class BlockSidingVerticalFMBlack extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:siding_vertical_fm_black")
    public static final Block block = null;

    public BlockSidingVerticalFMBlack(Elements instance) {
        super(instance, 631);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("siding_vertical_fm_black"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation("fwparchitecturalenhancements:siding_vertical_fm_black", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.WOOD);
            setUnlocalizedName("siding_vertical_fm_black");
            setSoundType(SoundType.WOOD);
            setHarvestLevel("axe", 1);
            setHardness(1F);
            setResistance(10F);
            setLightLevel(0F);
            setLightOpacity(255);
            setCreativeTab(TabArchitecturalEnhancements.ExteriorDeco);
        }
    }
}
