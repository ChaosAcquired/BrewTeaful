package net.chaosacquired.brewteaful.item;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrewTeaful.MOD_ID);

    public static final RegistryObject<Item> TEALEAF = ITEMS.register("tealeaf",
            () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> TEASEEDS = ITEMS.register("teaseeds",
        () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
