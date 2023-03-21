package net.thebois.critters.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.entity.custom.SnailEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnailModel extends AnimatedGeoModel<SnailEntity> {
    @Override
    public ResourceLocation getModelLocation(SnailEntity object) {
        return new ResourceLocation(CrittersMod.MOD_ID, "geo/puku.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SnailEntity object) {
        return new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/puku/puku.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SnailEntity animatable) {
        return new ResourceLocation(CrittersMod.MOD_ID, "animations/puku.animation.json");
    }
}
