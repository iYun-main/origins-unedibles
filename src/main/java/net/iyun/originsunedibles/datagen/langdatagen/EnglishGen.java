package net.iyun.originsunedibles.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.originsunedibles.item.OriginItems;

public class EnglishGen extends FabricLanguageProvider {
    public EnglishGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(OriginItems.EDIBLE_COAL,"Coal");
    }
}
