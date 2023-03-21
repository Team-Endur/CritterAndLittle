package net.thebois.critters.world;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.thebois.critters.entity.ModEntityCreator;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {

        if(doesBiomeMatch(event.getName(), Biomes.SAVANNA)) {
            event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT).add(new MobSpawnSettings.SpawnerData(ModEntityCreator.SNAIL.get(), 6, 2, 3));
        }
    }

    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn) {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}
