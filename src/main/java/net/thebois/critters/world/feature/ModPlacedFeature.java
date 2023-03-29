package net.thebois.critters.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeature {

    public static final Holder<PlacedFeature> PEBBLE_PLACED = PlacementUtils.register("pebble_placed",
            ModConfiguredFeature.PEBBLE_SPAWN, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> STICK_PLACED = PlacementUtils.register("stick_placed",
            ModConfiguredFeature.STICK_SPAWN, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> BONE_PLACED = PlacementUtils.register("bone_placed",
            ModConfiguredFeature.BONE_SPAWN, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}
