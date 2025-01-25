package net.iyun.originsunedibles;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.iyun.originsunedibles.datagen.ModItemTagProvider;
import net.iyun.originsunedibles.datagen.ModelProvider;
import net.iyun.originsunedibles.datagen.langdatagen.EnglishGen;

public class OriginsUnediblesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishGen::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(ModItemTagProvider::new);


	}
}
