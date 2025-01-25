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
        itemModelGenerator.register(OriginItems.EDIBLE_CLAY_BALL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GLOW_INK_SAC, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_INK_SAC, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_HONEYCOMB, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_PRISMARINE_CRYSTALS, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_PRISMARINE_SHARD, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_RABBIT_FOOT, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_RABBIT_HIDE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_SCUTE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_SLIME_BALL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_ENDER_EYE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_ENDER_PEARL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_HEART_SEA, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NAUT_SHELL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NETH_STAR, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_SHULKER_SHELL, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_POPPED_CHORUS, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BEETROOT_SEED, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BOOK, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BRICK, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_ECHO, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GHAST_TEAR, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GLASS_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_GLOW_DUST, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_KELP, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_MAGMA_CREAM, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_MELON_SEED, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NETHER_WART, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_PAPER, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_MEMBRANE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_PITHCHER, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_NETHER_BRICK, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_PUMP_SEEDS, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_SUGAR_CANE, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_TURT_EGG, Models.GENERATED);
        itemModelGenerator.register(OriginItems.EDIBLE_BONE, Models.HANDHELD);
        itemModelGenerator.register(OriginItems.EDIBLE_STICK, Models.HANDHELD);
        itemModelGenerator.register(OriginItems.EDIBLE_BLAZE_ROD, Models.HANDHELD);
        itemModelGenerator.register(OriginItems.EDIBLE_BAMBOO, Models.HANDHELD);

    }
}
