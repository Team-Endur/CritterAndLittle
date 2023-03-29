package net.thebois.critters.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thebois.critters.CrittersMod;
import net.thebois.critters.entity.custom.SlugEntity;
import net.thebois.critters.entity.variant.SlugVariant;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SlugRenderer extends GeoEntityRenderer<SlugEntity> {
    public static final Map<SlugVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SlugVariant.class), (p_114874_) -> {
                p_114874_.put(SlugVariant.BLACK,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_black.png"));
                p_114874_.put(SlugVariant.WHITE,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_white.png"));
                p_114874_.put(SlugVariant.ORANGE,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_orange.png"));
                p_114874_.put(SlugVariant.BANANA,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_banana.png"));
                p_114874_.put(SlugVariant.SLIME,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_slime.png"));
                p_114874_.put(SlugVariant.FLUORESCENT,
                        new ResourceLocation(CrittersMod.MOD_ID, "textures/entity/slug/slug_fluorescent.png"));
            });
    
    public SlugRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SlugModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SlugEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(SlugEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
