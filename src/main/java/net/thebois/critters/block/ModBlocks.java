package net.thebois.critters.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.block.custom.PebbleBlock;
import net.thebois.critters.item.ModCreativeModeTabs;
import net.thebois.critters.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrittersMod.MOD_ID);

    public static final RegistryObject<Block> PEBBLE = registerBlock("pebble",
            () -> new PebbleBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(0.4F).sound(SoundType.STONE)), ModCreativeModeTabs.CRITTERS_TAB);

    public static final RegistryObject<Block> STICK = registerBlock("stick",
            () -> new PebbleBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(0.2F).sound(SoundType.WOOD)), ModCreativeModeTabs.CRITTERS_TAB);

    public static final RegistryObject<Block> BONE = registerBlock("bone",
            () -> new PebbleBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(0.2F).sound(SoundType.BONE_BLOCK)), ModCreativeModeTabs.CRITTERS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
