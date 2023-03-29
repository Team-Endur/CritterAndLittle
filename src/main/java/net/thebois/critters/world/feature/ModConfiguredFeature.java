package net.thebois.critters.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.thebois.critters.block.ModBlocks;

public class ModConfiguredFeature {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PEBBLE_SPAWN =
            FeatureUtils.register("pebble_spawn", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PEBBLE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> STICK_SPAWN =
            FeatureUtils.register("stick_spawn", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STICK.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BONE_SPAWN =
            FeatureUtils.register("bone_spawn", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STICK.get())))));
}
