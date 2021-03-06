package net.chocomint.xchemical.block.entity;

import net.chocomint.xchemical.XChemical;
import net.chocomint.xchemical.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

	public static BlockEntityType<AnalyzerBlockEntity> ANALYZER_BLOCK_ENTITY;
	public static BlockEntityType<CompoundMixerBlockEntity> COMPOUND_MIXER_BLOCK_ENTITY;
	public static BlockEntityType<ConstructorBlockEntity> CONSTRUCTOR_BLOCK_ENTITY;
	public static BlockEntityType<CheMinBlockEntity> CHEMIN_BLOCK_ENTITY;

	public static void registerModBlockEntities() {
		ANALYZER_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				new Identifier(XChemical.MOD_ID, "analyzer_block_entity"),
				FabricBlockEntityTypeBuilder.create(AnalyzerBlockEntity::new, ModBlocks.ANALYZER).build(null));
		COMPOUND_MIXER_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				new Identifier(XChemical.MOD_ID, "compound_mixer_block_entity"),
				FabricBlockEntityTypeBuilder.create(CompoundMixerBlockEntity::new, ModBlocks.COMPOUND_MIXER).build(null));
		CONSTRUCTOR_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				new Identifier(XChemical.MOD_ID, "constructor_block_entity"),
				FabricBlockEntityTypeBuilder.create(ConstructorBlockEntity::new, ModBlocks.CONSTRUCTOR).build(null));
		CHEMIN_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
				new Identifier(XChemical.MOD_ID, "chemin_block_entity"),
				FabricBlockEntityTypeBuilder.create(CheMinBlockEntity::new, ModBlocks.CHEMIN).build(null));
	}

}
