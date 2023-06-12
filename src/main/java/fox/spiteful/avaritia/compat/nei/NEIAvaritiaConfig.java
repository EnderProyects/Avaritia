package fox.spiteful.avaritia.compat.nei;

import net.minecraft.item.ItemStack;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import fox.spiteful.avaritia.compat.botania.ItemInfinitatoCostume;
import fox.spiteful.avaritia.compat.botania.Tsundere;

@SuppressWarnings("unused")
public class NEIAvaritiaConfig implements IConfigureNEI {

    @Override
    public void loadConfig() {
        ExtremeShapedRecipeHandler shaped = new ExtremeShapedRecipeHandler();
        ExtremeShapelessRecipeHandler shapeless = new ExtremeShapelessRecipeHandler();
        CompressionHandler compress = new CompressionHandler();
        API.registerRecipeHandler(shaped);
        API.registerRecipeHandler(shapeless);
        API.registerRecipeHandler(compress);
        API.registerUsageHandler(shaped);
        API.registerUsageHandler(shapeless);
        API.registerUsageHandler(compress);

        if (Tsundere.costumes != null) {
            for (int i = 0; i < ItemInfinitatoCostume.types.length; i++) {
                API.hideItem(new ItemStack(Tsundere.costumes, 1, i));
            }
        }
    }

    @Override
    public String getName() {
        return "Avaritia NEI plugin";
    }

    @Override
    public String getVersion() {
        return "";
    }
}
