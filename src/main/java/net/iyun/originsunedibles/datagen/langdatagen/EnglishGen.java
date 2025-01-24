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
        translationBuilder.add(OriginItems.EDIBLE_COAL,"Edible Coal");
        translationBuilder.add(OriginItems.EDIBLE_CHARCOAL,"Edible Charcoal");
        translationBuilder.add(OriginItems.EDIBLE_REDSTONE,"Edible Redstone");
        translationBuilder.add(OriginItems.EDIBLE_RAWIRON,"Edible Raw Iron");
        translationBuilder.add(OriginItems.EDIBLE_RAWGOLD,"Edible Raw Gold");
        translationBuilder.add(OriginItems.EDIBLE_RAWCOPPER,"Edible Raw Copper");
        translationBuilder.add(OriginItems.EDIBLE_LAPIS_LAZULI,"Edible Lapis Lazuli");
        translationBuilder.add(OriginItems.EDIBLE_DIAMOND,"Edible Diamond");
        translationBuilder.add(OriginItems.EDIBLE_EMERALD,"Edible Emerald");
        translationBuilder.add(OriginItems.EDIBLE_LEATHER,"Edible Leather");
        translationBuilder.add(OriginItems.EDIBLE_BONE,"Edible Bone");
    }
}
