package net.iyun.originsunedibles.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.iyun.originsunedibles.item.OriginItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ConventionalItemTags.FOODS)
                .add(OriginItems.EDIBLE_COAL.asItem())
                .add(OriginItems.EDIBLE_CHARCOAL.asItem())
                .add(OriginItems.EDIBLE_RAWGOLD.asItem())
                .add(OriginItems.EDIBLE_RAWCOPPER.asItem())
                .add(OriginItems.EDIBLE_RAWIRON.asItem())
                .add(OriginItems.EDIBLE_LAPIS_LAZULI.asItem())
                .add(OriginItems.EDIBLE_LEATHER.asItem())
                .add(OriginItems.EDIBLE_EMERALD.asItem())
                .add(OriginItems.EDIBLE_DIAMOND.asItem())
                .add(OriginItems.EDIBLE_REDSTONE.asItem())
                .add(OriginItems.EDIBLE_AMETHYST_SHARD.asItem())
                .add(OriginItems.EDIBLE_COPPER_INGOT.asItem())
                .add(OriginItems.EDIBLE_GOLD_INGOT.asItem())
                .add(OriginItems.EDIBLE_GOLD_NUG.asItem())
                .add(OriginItems.EDIBLE_IRON_NUG.asItem())
                .add(OriginItems.EDIBLE_NETHERITE_INGOT.asItem())
                .add(OriginItems.EDIBLE_NETH_SCRAP.asItem())
                .add(OriginItems.EDIBLE_QUARTZ.asItem())
                .add(OriginItems.EDIBLE_BOWL.asItem())
                .add(OriginItems.EDIBLE_IRON_INGOT.asItem())
                .add(OriginItems.EDIBLE_BONEMEAL.asItem())
                .add(OriginItems.EDIBLE_EGG.asItem())
                .add(OriginItems.EDIBLE_FEATHER.asItem())
                .add(OriginItems.EDIBLE_FLINT.asItem())
                .add(OriginItems.EDIBLE_SNOWBALL.asItem())
                .add(OriginItems.EDIBLE_STRING.asItem())
                .add(OriginItems.EDIBLE_WHEAT.asItem())
                .add(OriginItems.EDIBLE_WHEAT_SEEDS.asItem())
                .add(OriginItems.EDIBLE_CLAY_BALL.asItem())
                .add(OriginItems.EDIBLE_GLOW_INK_SAC.asItem())
                .add(OriginItems.EDIBLE_INK_SAC.asItem())
                .add(OriginItems.EDIBLE_HONEYCOMB.asItem())
                .add(OriginItems.EDIBLE_PRISMARINE_CRYSTALS.asItem())
                .add(OriginItems.EDIBLE_PRISMARINE_SHARD.asItem())
                .add(OriginItems.EDIBLE_RABBIT_FOOT.asItem())
                .add(OriginItems.EDIBLE_RABBIT_HIDE.asItem())
                .add(OriginItems.EDIBLE_SCUTE.asItem())
                .add(OriginItems.EDIBLE_SLIME_BALL.asItem())
                .add(OriginItems.EDIBLE_ENDER_EYE.asItem())
                .add(OriginItems.EDIBLE_ENDER_PEARL.asItem())
                .add(OriginItems.EDIBLE_FIRE_CHARGE.asItem())
                .add(OriginItems.EDIBLE_HEART_SEA.asItem())
                .add(OriginItems.EDIBLE_NAUT_SHELL.asItem())
                .add(OriginItems.EDIBLE_NETH_STAR.asItem())
                .add(OriginItems.EDIBLE_SHULKER_SHELL.asItem())
                .add(OriginItems.EDIBLE_POPPED_CHORUS.asItem())
                .add(OriginItems.EDIBLE_BEETROOT_SEED.asItem())
                .add(OriginItems.EDIBLE_BOOK.asItem())
                .add(OriginItems.EDIBLE_BRICK.asItem())
                .add(OriginItems.EDIBLE_ECHO.asItem())
                .add(OriginItems.EDIBLE_GHAST_TEAR.asItem())
                .add(OriginItems.EDIBLE_GLASS_BOTTLE.asItem())
                .add(OriginItems.EDIBLE_GLOW_DUST.asItem())
                .add(OriginItems.EDIBLE_KELP.asItem())
                .add(OriginItems.EDIBLE_MAGMA_CREAM.asItem())
                .add(OriginItems.EDIBLE_MELON_SEED.asItem())
                .add(OriginItems.EDIBLE_NETHER_WART.asItem())
                .add(OriginItems.EDIBLE_PAPER.asItem())
                .add(OriginItems.EDIBLE_MEMBRANE.asItem())
                .add(OriginItems.EDIBLE_PITHCHER.asItem())
                .add(OriginItems.EDIBLE_NETHER_BRICK.asItem())
                .add(OriginItems.EDIBLE_PUMP_SEEDS.asItem())
                .add(OriginItems.EDIBLE_SUGAR_CANE.asItem())
                .add(OriginItems.EDIBLE_TURT_EGG.asItem())
                .add(OriginItems.EDIBLE_BONE .asItem())
                .add(OriginItems.EDIBLE_STICK .asItem())
                .add(OriginItems.EDIBLE_BLAZE_ROD .asItem())
                .add(OriginItems.EDIBLE_ACA_SAP.asItem())
                .add(OriginItems.EDIBLE_BIRCH_SAP.asItem())
                .add(OriginItems.EDIBLE_CHERR_SAP.asItem())
                .add(OriginItems.EDIBLE_ALLU.asItem())
                .add(OriginItems.EDIBLE_AZU.asItem())
                .add(OriginItems.EDIBLE_ORCH.asItem())
                .add(OriginItems.EDIBLE_BROWN_MUSH.asItem())
                .add(OriginItems.EDIBLE_COBWEB.asItem())
                .add(OriginItems.EDIBLE_CORNF.asItem())
                .add(OriginItems.EDIBLE_CRIM_FUNG.asItem())
                .add(OriginItems.EDIBLE_CRIM_ROOT.asItem())
                .add(OriginItems.EDIBLE_DAND.asItem())
                .add(OriginItems.EDIBLE_DARK_OAK_SAP.asItem())
                .add(OriginItems.EDIBLE_HANGING_ROOT.asItem())
                .add(OriginItems.EDIBLE_JUNGLE_SAP.asItem())
                .add(OriginItems.EDIBLE_LILY_VAL.asItem())
                .add(OriginItems.EDIBLE_MANGROVE_SAP.asItem())
                .add(OriginItems.EDIBLE_OAK_SAP.asItem())
                .add(OriginItems.EDIBLE_ORANGE_TU.asItem())
                .add(OriginItems.EDIBLE_OXEYE.asItem())
                .add(OriginItems.EDIBLE_PINK_TU.asItem())
                .add(OriginItems.EDIBLE_POPPY.asItem())
                .add(OriginItems.EDIBLE_RED_SHROOM.asItem())
                .add(OriginItems.EDIBLE_RED_TU.asItem())
                .add(OriginItems.EDIBLE_SPRUCE_SAP.asItem())
                .add(OriginItems.EDIBLE_SUNFL.asItem())
                .add(OriginItems.EDIBLE_TORCHFL.asItem())
                .add(OriginItems.EDIBLE_TWIST_VINE.asItem())
                .add(OriginItems.EDIBLE_WARP_FUNG.asItem())
                .add(OriginItems.EDIBLE_WARP_ROOT.asItem())
                .add(OriginItems.EDIBLE_WEEP_VINE.asItem())
                .add(OriginItems.EDIBLE_WHITE_TU.asItem())
                .add(OriginItems.EDIBLE_WITHER.asItem())
                .add(OriginItems.EDIBLE_BAMBOO .asItem());

    }
}
