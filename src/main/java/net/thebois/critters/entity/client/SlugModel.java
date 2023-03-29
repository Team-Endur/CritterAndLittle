package net.thebois.critters.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.entity.custom.SlugEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SlugModel extends AnimatedGeoModel<SlugEntity> {
    @Override
    public ResourceLocation getModelLocation(SlugEntity object) {
        return new ResourceLocation(CrittersMod.MOD_ID, "geo/slug.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SlugEntity object) {
        return SlugRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SlugEntity animatable) {
        return new ResourceLocation(CrittersMod.MOD_ID, "animations/slug.animation.json");
    }
}
