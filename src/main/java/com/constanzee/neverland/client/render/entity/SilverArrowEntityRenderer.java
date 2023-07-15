package com.constanzee.neverland.client.render.entity;

import com.constanzee.neverland.entity.SilverArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SilverArrowEntityRenderer extends ProjectileEntityRenderer<SilverArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("neverland:textures/entity/silver_arrow.png");

    public SilverArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SilverArrowEntity entity) {
        return TEXTURE;
    }
}
