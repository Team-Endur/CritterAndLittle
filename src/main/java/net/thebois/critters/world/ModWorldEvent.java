package net.thebois.critters.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.world.gen.ModFlowerGeneration;

@Mod.EventBusSubscriber(modid = CrittersMod.MOD_ID)
public class ModWorldEvent {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModFlowerGeneration.generateFlowers(event);
        ModEntityGeneration.onEntitySpawn(event);
    }
}
