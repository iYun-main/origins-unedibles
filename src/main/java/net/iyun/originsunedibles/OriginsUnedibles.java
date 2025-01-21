package net.iyun.originsunedibles;

import net.fabricmc.api.ModInitializer;

import net.iyun.originsunedibles.item.OriginItemGroup;
import net.iyun.originsunedibles.item.OriginItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OriginsUnedibles implements ModInitializer {
	public static final String MOD_ID = "originsunedibles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		OriginItemGroup.registerItemGroups();
		OriginItems.registerModItems();

		LOGGER.info("Your Unedibles are delivered! Enjoy");
	}
}