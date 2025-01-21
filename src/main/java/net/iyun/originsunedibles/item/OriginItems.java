package net.iyun.originsunedibles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iyun.originsunedibles.OriginsUnedibles;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OriginItems {

    public static final Item EDIBLE_COAL = registerItem("edible_coal", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OriginsUnedibles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OriginsUnedibles.LOGGER.info("Converting Unedibles to Edibles provided by " + OriginsUnedibles.MOD_ID);
    }
}

