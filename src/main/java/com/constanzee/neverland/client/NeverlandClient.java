package com.constanzee.neverland.client;

import com.constanzee.neverland.client.render.entity.SilverArrowEntityRenderer;
import com.constanzee.neverland.entity.ModEntityType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class NeverlandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityType.SILVER_ARROW, SilverArrowEntityRenderer::new);
    }
}