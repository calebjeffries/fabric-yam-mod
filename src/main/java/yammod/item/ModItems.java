package yammod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item YAM;
    public static Item YAM_AXE;
    public static Item YAM_HOE;
    public static Item YAM_PICKAXE;
    public static Item YAM_SHOVEL;
    public static Item YAM_SWORD;
    public static final YamMaterial YAM_MATERIAL_INSTANCE = new YamMaterial();
    public static Item CreateItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("yammod", name), item);
    }
    public static void Initialize() {
        // Yam
        FoodComponent YAM_COMPONENT = new FoodComponent.Builder().build();
        YAM = CreateItem("yam", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(YAM));
        CompostingChanceRegistry.INSTANCE.add(YAM, 0.3f); // Make the yam compostable

        // Yam Axe
        YAM_AXE = CreateItem("yam_axe", new AxeItem(YAM_MATERIAL_INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(YAM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(YAM_AXE));

        // Yam Hoe
        YAM_HOE = CreateItem("yam_hoe", new HoeItem(YAM_MATERIAL_INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(YAM_HOE));

        // Yam Shovel
        YAM_SHOVEL = CreateItem("yam_shovel", new ShovelItem(YAM_MATERIAL_INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(YAM_SHOVEL));

        // Yam Pickaxe
        YAM_PICKAXE = CreateItem("yam_pickaxe", new PickaxeItem(YAM_MATERIAL_INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(YAM_PICKAXE));

        // Yam Sword
        YAM_SWORD = CreateItem("yam_sword", new SwordItem(YAM_MATERIAL_INSTANCE, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(YAM_SWORD));
    }
}
