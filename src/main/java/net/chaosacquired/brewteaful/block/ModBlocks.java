package net.chaosacquired.brewteaful.block;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.chaosacquired.brewteaful.item.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BrewTeaful.MOD_ID);


    public static final RegistryObject<Block> TEA_LEAF_BLOCK = registerBlock("tea_leaf_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK)
                    .mapColor(MapColor.COLOR_GREEN)
                    .pushReaction(PushReaction.DESTROY)

            ));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlock(name, toReturn);
        return toReturn;
    }


    private  static <T extends Blocks> void registerBlockItem(String name, RegistryObject<T> block) {
        RegistryObject<Item> register = ModItem.ITEMS.register(name, () -> new BlockItem(Block.get(), new Item.Properties()));

    }

   public static void register(IEventBus eventBus) {
       BLOCKS.register(eventBus);
   }

}
