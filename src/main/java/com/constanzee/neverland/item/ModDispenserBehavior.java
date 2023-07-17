package com.constanzee.neverland.item;

import com.constanzee.neverland.Neverland;
import com.constanzee.neverland.entity.SilverArrowEntity;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

import java.lang.reflect.Constructor;

public class ModDispenserBehavior {

    private static void registerArrow(Item item, Class<? extends PersistentProjectileEntity> arrowClass, PersistentProjectileEntity.PickupPermission pickupPermission) {
        DispenserBlock.registerBehavior(item, new ProjectileDispenserBehavior() {
            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                try {
                    Constructor<?> constructor = arrowClass.getConstructor(World.class, double.class, double.class, double.class);
                    PersistentProjectileEntity arrowEntity = (PersistentProjectileEntity) constructor.newInstance(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = pickupPermission;
                    return arrowEntity;
                } catch (Exception e) {
                    Neverland.logException(e);
                }

                return null;
            }
        });
    }

    public static void register() {
        registerArrow(ModItems.SILVER_ARROW, SilverArrowEntity.class, PersistentProjectileEntity.PickupPermission.ALLOWED);
    }
}
