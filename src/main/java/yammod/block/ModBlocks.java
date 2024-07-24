package yammod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block YAM_BLOCK;
    public static Block CreateBlock(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of("yammod", name), new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of("yammod", name), block);
    }
    public static void Initialize() {
        // Yam Block
        YAM_BLOCK = CreateBlock("yam_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.add(YAM_BLOCK.asItem()));
    }
}
