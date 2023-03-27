package fuzs.horseexpert.data;

import fuzs.horseexpert.init.ModRegistry;
import fuzs.puzzleslib.api.data.v1.AbstractRecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends AbstractRecipeProvider {

    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModRegistry.MONOCLE_ITEM.get())
                .define('#', Blocks.GLASS_PANE)
                .define('G', Items.GOLD_NUGGET)
                .pattern(" G ")
                .pattern("G#G")
                .pattern(" G ")
                .unlockedBy(getHasName(Items.GOLD_NUGGET), has(Items.GOLD_NUGGET))
                .save(exporter);
    }
}
