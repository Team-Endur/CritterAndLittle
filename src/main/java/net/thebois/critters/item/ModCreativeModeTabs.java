package net.thebois.critters.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab CRITTERS_TAB = new CreativeModeTab("critters_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SNAIL_SPAWN_EGG.get());
        }
    };
}
