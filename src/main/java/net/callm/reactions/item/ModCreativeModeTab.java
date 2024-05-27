package net.callm.reactions.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

public class ModCreativeModeTab {
    public static final CreativeModeTab REACTIONS_TAB = new CreativeModeTab("reactionstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CARBON.get());
        }
    };
}
