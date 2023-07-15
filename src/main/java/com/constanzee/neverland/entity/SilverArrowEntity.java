package com.constanzee.neverland.entity;

import com.constanzee.neverland.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilverArrowEntity extends PersistentProjectileEntity {

    public SilverArrowEntity(EntityType<? extends SilverArrowEntity> entityType, World world) {
        super((EntityType<? extends PersistentProjectileEntity>)entityType, world);
    }

    public SilverArrowEntity(World world, double x, double y, double z) {
        super(ModEntityType.SILVER_ARROW, x, y, z, world);
    }

    public SilverArrowEntity(World world, LivingEntity owner) {
        super(ModEntityType.SILVER_ARROW, owner, world);
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(ModItems.SILVER_ARROW);
    }
}
