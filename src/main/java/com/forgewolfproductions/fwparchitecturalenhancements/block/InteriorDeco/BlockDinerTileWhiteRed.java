
package com.forgewolfproductions.fwparchitecturalenhancements.block.InteriorDeco;

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
public class BlockDinerTileWhiteRed extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:diner_tile_white_red")
	public static final Block block = null;
	public BlockDinerTileWhiteRed(Elements instance) {
		super(instance, 577);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("diner_tile_white_red"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:diner_tile_white_red", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("diner_tile_white_red");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.InteriorDeco);
		}
	}
}
