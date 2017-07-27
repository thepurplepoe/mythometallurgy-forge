package thepurplepoe.mythometallurgy.common.block;

import net.minecraft.block.material.Material;
import thepurplepoe.api.API;
import thepurplepoe.api.blocks.BlockWrapper;
import thepurplepoe.mythometallurgy.common.MythoMetallurgy;

public class Blocks {
	public static BlockWrapper divineSteelBlock;
	
	public static void setup() {
		divineSteelBlock = new BlockWrapper(Material.IRON, "divineSteelBlock");
		divineSteelBlock.setCreativeTab(MythoMetallurgy.creativeTab);
	}
	
	public static void register() {
		API.registerBlock(divineSteelBlock);
	}
}
