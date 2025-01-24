package net.iyun.originsunedibles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iyun.originsunedibles.OriginsUnedibles;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OriginItems {

    public static final Item EDIBLE_COAL = registerItem("edible_coal", new Item(new FabricItemSettings().food(FoodControl.COAL)));
    public static final Item EDIBLE_CHARCOAL = registerItem("edible_charcoal", new Item(new FabricItemSettings().food(FoodControl.CHARCOAL)));
    public static final Item EDIBLE_RAWIRON = registerItem("edible_raw_iron", new Item(new FabricItemSettings().food(FoodControl.RAWIRON)));
    public static final Item EDIBLE_RAWGOLD = registerItem("edible_raw_gold", new Item(new FabricItemSettings().food(FoodControl.RAWGOLD)));
    public static final Item EDIBLE_RAWCOPPER = registerItem("edible_raw_copper", new Item(new FabricItemSettings().food(FoodControl.RAWCOPPER)));
    public static final Item EDIBLE_LAPIS_LAZULI = registerItem("edible_lapis_lazuli", new Item(new FabricItemSettings().food(FoodControl.LAPIS)));
    public static final Item EDIBLE_REDSTONE = registerItem("edible_redstone", new Item(new FabricItemSettings().food(FoodControl.REDSTONE)));
    public static final Item EDIBLE_EMERALD = registerItem("edible_emerald", new Item(new FabricItemSettings().food(FoodControl.EMERALD)));
    public static final Item EDIBLE_DIAMOND = registerItem("edible_diamond", new Item(new FabricItemSettings().food(FoodControl.DIAMOND)));
    public static final Item EDIBLE_LEATHER = registerItem("edible_leather", new Item(new FabricItemSettings().food(FoodControl.LEATHER)));
    public static final Item EDIBLE_AMETHYST_SHARD = registerItem("edible_amethyst_shard", new Item(new FabricItemSettings().food(FoodControl.AMETHYSTSHARD)));
    public static final Item EDIBLE_BOWL = registerItem("edible_bowl", new Item(new FabricItemSettings().food(FoodControl.BOWL)));
    public static final Item EDIBLE_COPPER_INGOT = registerItem("edible_copper_ingot", new Item(new FabricItemSettings().food(FoodControl.COPPER_INGOT)));
    public static final Item EDIBLE_GOLD_INGOT = registerItem("edible_gold_ingot", new Item(new FabricItemSettings().food(FoodControl.GOLD_INGOT)));
    public static final Item EDIBLE_NETHERITE_INGOT = registerItem("edible_netherite_ingot", new Item(new FabricItemSettings().food(FoodControl.NETH_INGOT)));
    public static final Item EDIBLE_IRON_INGOT = registerItem("edible_iron_ingot", new Item(new FabricItemSettings().food(FoodControl.IRON_INGOT)));
    public static final Item EDIBLE_IRON_NUG = registerItem("edible_iron_nugget", new Item(new FabricItemSettings().food(FoodControl.GOLD_NUG)));
    public static final Item EDIBLE_GOLD_NUG = registerItem("edible_gold_nugget", new Item(new FabricItemSettings().food(FoodControl.IRON_NUG)));
    public static final Item EDIBLE_NETH_SCRAP = registerItem("edible_netherite_scrap", new Item(new FabricItemSettings().food(FoodControl.NETH_SCRAP)));
    public static final Item EDIBLE_QUARTZ = registerItem("edible_quartz", new Item(new FabricItemSettings().food(FoodControl.QUARTZ)));
    public static final Item EDIBLE_BONE = registerItem("edible_bone", new Item(new FabricItemSettings().food(FoodControl.BONE)));
    public static final Item EDIBLE_BONEMEAL = registerItem("edible_bone_meal", new Item(new FabricItemSettings().food(FoodControl.BONEMEAL)));
    public static final Item EDIBLE_EGG = registerItem("edible_egg", new Item(new FabricItemSettings().maxCount(16).food(FoodControl.EGG)));
    public static final Item EDIBLE_FEATHER = registerItem("edible_feather", new Item(new FabricItemSettings().food(FoodControl.FEATHER)));
    public static final Item EDIBLE_FLINT = registerItem("edible_flint", new Item(new FabricItemSettings().food(FoodControl.FLINT)));
    public static final Item EDIBLE_SNOWBALL = registerItem("edible_snowball", new Item(new FabricItemSettings().maxCount(16).food(FoodControl.SNOWBALL)));
    public static final Item EDIBLE_STICK = registerItem("edible_stick", new Item(new FabricItemSettings().food(FoodControl.STICK)));
    public static final Item EDIBLE_STRING = registerItem("edible_string", new Item(new FabricItemSettings().food(FoodControl.STRING)));
    public static final Item EDIBLE_WHEAT = registerItem("edible_wheat", new Item(new FabricItemSettings().food(FoodControl.WHEAT)));
    public static final Item EDIBLE_WHEAT_SEEDS = registerItem("edible_wheat_seeds", new Item(new FabricItemSettings().food(FoodControl.WHEATSEEDS)));
    public static final Item EDIBLE_CLAY_BALL= registerItem("edible_clay_ball", new Item(new FabricItemSettings().food(FoodControl.CLAYBALL)));
    public static final Item EDIBLE_GLOW_INK_SAC = registerItem("edible_glow_ink_sac", new Item(new FabricItemSettings().food(FoodControl.GSACKINK)));
    public static final Item EDIBLE_INK_SAC = registerItem("edible_ink_sac", new Item(new FabricItemSettings().food(FoodControl.SACKINK)));
    public static final Item EDIBLE_HONEYCOMB = registerItem("edible_honeycomb", new Item(new FabricItemSettings().food(FoodControl.HONEYCOMB)));
    public static final Item EDIBLE_PRISMARINE_CRYSTALS = registerItem("edible_prismarine_crystals", new Item(new FabricItemSettings().food(FoodControl.PRISMACRYSTAL)));
    public static final Item EDIBLE_PRISMARINE_SHARD = registerItem("edible_prismarine_shard", new Item(new FabricItemSettings().food(FoodControl.PRISMASHARD)));
    public static final Item EDIBLE_RABBIT_FOOT = registerItem("edible_rabbit_foot", new Item(new FabricItemSettings().food(FoodControl.RABBITFOOT)));
    public static final Item EDIBLE_RABBIT_HIDE = registerItem("edible_rabbit_hide", new Item(new FabricItemSettings().food(FoodControl.RABBITHIDE)));
    public static final Item EDIBLE_SCUTE = registerItem("edible_scute", new Item(new FabricItemSettings().food(FoodControl.SCUTE)));
    public static final Item EDIBLE_SLIME_BALL = registerItem("edible_slime_ball", new Item(new FabricItemSettings().food(FoodControl.SLIMEBALL)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OriginsUnedibles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OriginsUnedibles.LOGGER.info("Converting Unedibles to Edibles provided by " + OriginsUnedibles.MOD_ID);
    }
}

