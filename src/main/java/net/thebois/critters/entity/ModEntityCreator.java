package net.thebois.critters.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.entity.client.SnailRenderer;
import net.thebois.critters.entity.custom.SnailEntity;

@Mod.EventBusSubscriber(modid = CrittersMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityCreator {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, CrittersMod.MOD_ID);

    // REGESTRIES

    public static final RegistryObject<EntityType<SnailEntity>> SNAIL = ENTITY_TYPES.register("snail", () -> EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE).sized(0.4F, 0.4F).build(new ResourceLocation(CrittersMod.MOD_ID, "snail").toString()));

    // ATTRIBUTES

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityCreator.SNAIL.get(), SnailEntity.setAttributes());
    }

    // RENDERERS

    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityCreator.SNAIL.get(), SnailRenderer::new);
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
