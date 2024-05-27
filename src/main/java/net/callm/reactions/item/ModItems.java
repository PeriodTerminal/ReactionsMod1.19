package net.callm.reactions.item;

import net.callm.reactions.Reactions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Reactions.MOD_ID);

    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REACTIONS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
