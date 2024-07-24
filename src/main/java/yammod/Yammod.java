package yammod;

import net.fabricmc.api.ModInitializer;
import yammod.block.ModBlocks;
import yammod.item.ModItems;

public class Yammod implements ModInitializer {
    public void onInitialize() {
        ModItems.Initialize();
        ModBlocks.Initialize();
    }
}
