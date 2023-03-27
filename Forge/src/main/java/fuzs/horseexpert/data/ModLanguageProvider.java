package fuzs.horseexpert.data;

import fuzs.horseexpert.init.ModRegistry;
import fuzs.puzzleslib.api.data.v1.AbstractLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(PackOutput packOutput, String modId) {
        super(packOutput, modId);
    }

    @Override
    protected void addTranslations() {
        this.add(ModRegistry.MONOCLE_ITEM.get(), "Monocle");
        this.add("item.horseexpert.monocle.tooltip", "Wear this and look at a mount to see its statistics!");
        this.add("horse.tooltip.min", "Min: %s");
        this.add("horse.tooltip.max", "Max: %s");
        this.add("horse.tooltip.health", "Health: %s");
        this.add("horse.tooltip.health.unit", "%s hearts");
        this.add("horse.tooltip.speed", "Speed: %s");
        this.add("horse.tooltip.speed.unit", "%s blocks/second");
        this.add("horse.tooltip.jump_height", "Jump Height: %s");
        this.add("horse.tooltip.jump_height.unit", "%s blocks");
        this.add("horse.tooltip.strength", "Storage: %s");
        this.add("horse.tooltip.strength.unit", "%s slots");
    }
}
