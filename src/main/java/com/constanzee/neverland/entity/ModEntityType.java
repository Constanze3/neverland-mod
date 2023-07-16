package com.constanzee.neverland.entity;

import com.constanzee.neverland.Neverland;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityType {
    public static EntityType<SilverArrowEntity> SILVER_ARROW;

    private static <T extends Entity> EntityType<T> register(String id, EntityType<T> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(Neverland.MODID, id), entityType);
    }

    public static void register() {
       SILVER_ARROW = register("silver_arrow", FabricEntityTypeBuilder.create(SpawnGroup.MISC, (EntityType.EntityFactory<SilverArrowEntity>) SilverArrowEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());
    }
}
