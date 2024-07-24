package yammod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import static yammod.item.ModItems.YAM;

public class YamMaterial implements ToolMaterial {
    public int getDurability() {
        return 64;
    }
    public float getMiningSpeedMultiplier() {
        return 2.0F;
    }
    public float getAttackDamage() {
        return 1.5F;
    }
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }
    public int getEnchantability() {
        return 10;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(YAM);
    }
}
