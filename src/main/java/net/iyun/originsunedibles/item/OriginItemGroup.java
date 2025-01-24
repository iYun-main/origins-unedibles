package net.iyun.originsunedibles.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iyun.originsunedibles.OriginsUnedibles;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OriginItemGroup {
    public static final ItemGroup AAOrigin = Registry.register(Registries.ITEM_GROUP, new Identifier(OriginsUnedibles.MOD_ID,"aaorigin"),
            FabricItemGroup.builder().displayName(Text.literal("Origin Edible Unedibles")).icon(() -> new ItemStack(Items.WHEAT_SEEDS)).entries((displayContext, entries) -> {
                entries.add(OriginItems.EDIBLE_COAL);
                entries.add(OriginItems.EDIBLE_CHARCOAL);
                entries.add(OriginItems.EDIBLE_RAWCOPPER);
                entries.add(OriginItems.EDIBLE_RAWGOLD);
                entries.add(OriginItems.EDIBLE_RAWIRON);
                entries.add(OriginItems.EDIBLE_LAPIS_LAZULI);
                entries.add(OriginItems.EDIBLE_EMERALD);
                entries.add(OriginItems.EDIBLE_DIAMOND);
                entries.add(OriginItems.EDIBLE_REDSTONE);
                entries.add(OriginItems.EDIBLE_AMETHYST_SHARD);
                entries.add(OriginItems.EDIBLE_BOWL);
                entries.add(OriginItems.EDIBLE_COPPER_INGOT);
                entries.add(OriginItems.EDIBLE_GOLD_INGOT);
                entries.add(OriginItems.EDIBLE_IRON_INGOT);
                entries.add(OriginItems.EDIBLE_GOLD_NUG);
                entries.add(OriginItems.EDIBLE_IRON_NUG);
                entries.add(OriginItems.EDIBLE_NETH_SCRAP);
                entries.add(OriginItems.EDIBLE_NETHERITE_INGOT);
                entries.add(OriginItems.EDIBLE_QUARTZ);
                entries.add(OriginItems.EDIBLE_BONE);
                entries.add(OriginItems.EDIBLE_BONEMEAL);
                entries.add(OriginItems.EDIBLE_EGG);
                entries.add(OriginItems.EDIBLE_FEATHER);
                entries.add(OriginItems.EDIBLE_FLINT);
                entries.add(OriginItems.EDIBLE_SNOWBALL);
                entries.add(OriginItems.EDIBLE_STICK);
                entries.add(OriginItems.EDIBLE_STRING);
                entries.add(OriginItems.EDIBLE_WHEAT);
                entries.add(OriginItems.EDIBLE_WHEAT_SEEDS);
                entries.add(OriginItems.EDIBLE_LEATHER);
                entries.add(OriginItems.EDIBLE_CLAY_BALL);
                entries.add(OriginItems.EDIBLE_GLOW_INK_SAC);
                entries.add(OriginItems.EDIBLE_INK_SAC);
                entries.add(OriginItems.EDIBLE_HONEYCOMB);
                entries.add(OriginItems.EDIBLE_PRISMARINE_CRYSTALS);
                entries.add(OriginItems.EDIBLE_PRISMARINE_SHARD);
                entries.add(OriginItems.EDIBLE_RABBIT_FOOT);
                entries.add(OriginItems.EDIBLE_RABBIT_HIDE);
                entries.add(OriginItems.EDIBLE_SCUTE);
                entries.add(OriginItems.EDIBLE_SLIME_BALL);
            }).build());

    public static void registerItemGroups() {
        OriginsUnedibles.LOGGER.info("Inserting the Items in " + OriginsUnedibles.MOD_ID);
    }

}
