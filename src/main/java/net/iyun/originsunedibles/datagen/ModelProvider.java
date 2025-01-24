package net.iyun.originsunedibles.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.iyun.originsunedibles.item.OriginItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(OriginItems.EDIBLE_COAL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_CHARCOAL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_RAWGOLD, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_RAWCOPPER, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_RAWIRON, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_LAPIS_LAZULI, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_LEATHER, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_EMERALD, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_REDSTONE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_AMETHYST_SHARD, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_COPPER_INGOT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GOLD_NUG, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_IRON_NUG, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NETHERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NETH_SCRAP, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BOWL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BONEMEAL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_EGG, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_FEATHER, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_FLINT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_STRING, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_WHEAT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_WHEAT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BONE, Models.HANDHELD);
        itemModelGenerator.register(OriginItems.EDIBLE_STICK, Models.HANDHELD);

    }
}
