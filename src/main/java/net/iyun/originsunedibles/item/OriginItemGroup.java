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
            }).build());

    public static void registerItemGroups() {
        OriginsUnedibles.LOGGER.info("Inserting the Items in " + OriginsUnedibles.MOD_ID);
    }

}
