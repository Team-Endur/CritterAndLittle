package net.thebois.critters.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.thebois.critters.world.feature.ModPlacedFeature;

import java.util.List;
import java.util.Set;

public class ModFlowerGeneration {
    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


        if(!types.contains(BiomeDictionary.Type.END) || !types.contains(BiomeDictionary.Type.NETHER)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeature.PEBBLE_PLACED);
        }
        if(!types.contains(BiomeDictionary.Type.END) || !types.contains(BiomeDictionary.Type.NETHER)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeature.STICK_PLACED);
        }
        if(!types.contains(BiomeDictionary.Type.END) || !types.contains(BiomeDictionary.Type.NETHER)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeature.BONE_PLACED);
        }
    }
}
