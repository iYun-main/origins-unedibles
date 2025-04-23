package net.iyun.originsunedibles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iyun.originsunedibles.OriginsUnedibles;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OriginItems {

    public static final Item EDIBLE_COAL = registerItem("edible_coal", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CHARCOAL = registerItem("edible_charcoal", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RAWIRON = registerItem("edible_raw_iron", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RAWGOLD = registerItem("edible_raw_gold", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RAWCOPPER = registerItem("edible_raw_copper", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_LAPIS_LAZULI = registerItem("edible_lapis_lazuli", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_REDSTONE = registerItem("edible_redstone", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_EMERALD = registerItem("edible_emerald", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_DIAMOND = registerItem("edible_diamond", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_LEATHER = registerItem("edible_leather", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_AMETHYST_SHARD = registerItem("edible_amethyst_shard", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BOWL = registerItem("edible_bowl", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_COPPER_INGOT = registerItem("edible_copper_ingot", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GOLD_INGOT = registerItem("edible_gold_ingot", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NETHERITE_INGOT = registerItem("edible_netherite_ingot", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_IRON_INGOT = registerItem("edible_iron_ingot", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_IRON_NUG = registerItem("edible_iron_nugget", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GOLD_NUG = registerItem("edible_gold_nugget", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NETH_SCRAP = registerItem("edible_netherite_scrap", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_QUARTZ = registerItem("edible_quartz", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BONE = registerItem("edible_bone", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BONEMEAL = registerItem("edible_bone_meal", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_EGG = registerItem("edible_egg", new Item(new FabricItemSettings().maxCount(16).food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_FEATHER = registerItem("edible_feather", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_FLINT = registerItem("edible_flint", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SNOWBALL = registerItem("edible_snowball", new Item(new FabricItemSettings().maxCount(16).food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_STICK = registerItem("edible_stick", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_STRING = registerItem("edible_string", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WHEAT = registerItem("edible_wheat", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WHEAT_SEEDS = registerItem("edible_wheat_seeds", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CLAY_BALL= registerItem("edible_clay_ball", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GLOW_INK_SAC = registerItem("edible_glow_ink_sac", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_INK_SAC = registerItem("edible_ink_sac", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_HONEYCOMB = registerItem("edible_honeycomb", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PRISMARINE_CRYSTALS = registerItem("edible_prismarine_crystals", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PRISMARINE_SHARD = registerItem("edible_prismarine_shard", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RABBIT_FOOT = registerItem("edible_rabbit_foot", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RABBIT_HIDE = registerItem("edible_rabbit_hide", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SCUTE = registerItem("edible_scute", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SLIME_BALL = registerItem("edible_slime_ball", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BLAZE_ROD = registerItem("edible_blaze_rod", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ENDER_EYE = registerItem("edible_ender_eye", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ENDER_PEARL = registerItem("edible_ender_pearl", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_FIRE_CHARGE = registerItem("edible_fire_charge", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_HEART_SEA = registerItem("edible_heart_of_the_sea", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NAUT_SHELL = registerItem("edible_nautilus_shell", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NETH_STAR = registerItem("edible_nether_star", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_POPPED_CHORUS = registerItem("edible_popped_chorus_fruit", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SHULKER_SHELL = registerItem("edible_shulker_shell", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BAMBOO = registerItem("edible_bamboo", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BEETROOT_SEED = registerItem("edible_beetroot_seeds", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BOOK = registerItem("edible_book", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BRICK = registerItem("edible_brick", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ECHO = registerItem("edible_echo_shard", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GHAST_TEAR = registerItem("edible_ghast_tear", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GLASS_BOTTLE = registerItem("edible_glass_bottle", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_GLOW_DUST = registerItem("edible_glowstone_dust", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_KELP = registerItem("edible_kelp", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_MAGMA_CREAM = registerItem("edible_magma_cream", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_MELON_SEED = registerItem("edible_melon_seeds", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NETHER_BRICK = registerItem("edible_nether_brick", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_NETHER_WART = registerItem("edible_nether_wart", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PAPER = registerItem("edible_paper", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_MEMBRANE = registerItem("edible_phantom_membrane", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PITHCHER = registerItem("edible_pitcher_pod", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PUMP_SEEDS = registerItem("edible_pumpkin_seeds", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SUGAR_CANE = registerItem("edible_sugar_cane", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_TURT_EGG = registerItem("edible_turtle_egg", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));

    public static final Item EDIBLE_ACA_SAP = registerItem("edible_acacia_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BIRCH_SAP = registerItem("edible_birch_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CHERR_SAP = registerItem("edible_cherry_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ALLU = registerItem("edible_allium", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_AZU = registerItem("edible_azure_bluet", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ORCH = registerItem("edible_blue_orchid", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_BROWN_MUSH = registerItem("edible_brown_mushroom", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_COBWEB = registerItem("edible_cobweb", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CORNF = registerItem("edible_cornflower", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CRIM_FUNG = registerItem("edible_crimson_fungus", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_CRIM_ROOT = registerItem("edible_crimson_roots", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_DAND = registerItem("edible_dandelion", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_DARK_OAK_SAP = registerItem("edible_dark_oak_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_HANGING_ROOT = registerItem("edible_hanging_roots", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_JUNGLE_SAP = registerItem("edible_jungle_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_LILY_VAL = registerItem("edible_lily_of_the_valley", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_MANGROVE_SAP = registerItem("edible_mangrove_propagule", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_OAK_SAP = registerItem("edible_oak_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_ORANGE_TU = registerItem("edible_orange_tulip", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_OXEYE = registerItem("edible_oxeye_daisy", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_PINK_TU = registerItem("edible_pink_tulip", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_POPPY = registerItem("edible_poppy", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RED_SHROOM = registerItem("edible_red_mushroom", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_RED_TU = registerItem("edible_red_tulip", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SPRUCE_SAP = registerItem("edible_spruce_sapling", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_SUNFL = registerItem("edible_sunflower", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_TORCHFL = registerItem("edible_torchflower", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_TWIST_VINE = registerItem("edible_twisting_vines", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WARP_FUNG = registerItem("edible_warped_fungus", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WARP_ROOT = registerItem("edible_warped_roots", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WEEP_VINE = registerItem("edible_weeping_vines", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WHITE_TU = registerItem("edible_white_tulip", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));
    public static final Item EDIBLE_WITHER = registerItem("edible_wither_rose", new Item(new FabricItemSettings().food(FoodControl.NOFOODCONTROL)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OriginsUnedibles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OriginsUnedibles.LOGGER.info("Converting Unedibles to Edibles provided by " + OriginsUnedibles.MOD_ID);
    }
}

