package net.fwparchitecturalenhancements.block.ExteriorDeco;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.creativetab.CreativeTabExteriorDeco;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Elements.ModElement.Tag
public class BlockSidingWoodFMBlack extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:sidingwoodfmblack")
    public static final Block block = null;

    public BlockSidingWoodFMBlack(Elements instance) {
        super(instance, 430);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("sidingwoodfmblack"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation("fwparchitecturalenhancements:sidingwoodfmblack", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.WOOD);
            setUnlocalizedName("sidingwoodfmblack");
            setSoundType(SoundType.WOOD);
            setHarvestLevel("axe", 1);
            setHardness(1F);
            setResistance(10F);
            setLightLevel(0F);
            setLightOpacity(255);
            setCreativeTab(CreativeTabExteriorDeco.ExteriorDeco);
        }

        @Override
        public int tickRate(World world) {
            return 0;
        }
    }
}
