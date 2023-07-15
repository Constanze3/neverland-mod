package com.constanzee.neverland.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ModStatusEffect extends StatusEffect {

    public ModStatusEffect(StatusEffectCategory category) {
        super(category, 0x111111);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}