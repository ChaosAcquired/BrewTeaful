package net.chaosacquired.brewteaful.item;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, net.chaosacquired.brewteaful.BrewTeaful.MOD_ID);


    public static  final RegistryObject<CreativeModeTab> brewteaful = CREATIVE_MODE_TABS.register("brewteaful",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.TEALEAF.get()))
                    .title(Component.translatable("creativetab.brewteaful_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItem.TEALEAF.get());
                        output.accept(ModItem.TEASEEDS.get());
                    } )
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
