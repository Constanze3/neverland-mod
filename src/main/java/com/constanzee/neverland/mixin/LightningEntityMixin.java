package com.constanzee.neverland.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightningEntity.class)
public abstract class LightningEntityMixin extends Entity {
    private static final TrackedData<Boolean> NO_FIRE = DataTracker.registerData(LightningEntityMixin.class, TrackedDataHandlerRegistry.BOOLEAN);

    public LightningEntityMixin(EntityType<?> type, World world) {
        super(type, world);
        throw new AssertionError();
    }

    @Inject(method = "spawnFire", at = @At("HEAD"), cancellable = true)
    protected void injectSpawnFire(int spreadAttempts, CallbackInfo ci) {
        if (getDataTracker().get(NO_FIRE)) {
            ci.cancel();
        }
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("HEAD"))
    protected void injectWriteCustomDataToNbt(NbtCompound nbt, CallbackInfo ci) {
        nbt.putBoolean("NoFire", getDataTracker().get(NO_FIRE));
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("HEAD"))
    protected void injectReadCustomDataFromNbt(NbtCompound nbt, CallbackInfo ci) {
        this.setNoFire(nbt.getBoolean("NoFire"));
    }

    @Inject(method = "initDataTracker", at = @At("HEAD"))
    protected void injectInitDataTracker(CallbackInfo ci) {
        getDataTracker().startTracking(NO_FIRE, false);
    }

    public void setNoFire(boolean noFire) {
        getDataTracker().set(NO_FIRE, noFire);
    }

    public boolean noFire() {
        return this.getDataTracker().get(NO_FIRE);
    }
}