package net.chocomint.xchemical.block;

import net.chocomint.xchemical.XChemical;
import net.chocomint.xchemical.block.custom.AnalyzerBlock;
import net.chocomint.xchemical.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

	public static final Block ANALYZER = registerBlock("analyzer",
			new AnalyzerBlock(FabricBlockSettings.of(Material.METAL).strength(5.0f)), ModItemGroup.MACHINE);

	// Functions
	private static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registry.BLOCK, new Identifier(XChemical.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		return Registry.register(Registry.ITEM, new Identifier(XChemical.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)));
	}

	public static void registerModBlocks() {
		XChemical.LOGGER.info("Registering Mod Blocks for" + XChemical.MOD_ID);
	}
}
