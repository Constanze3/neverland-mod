package com.constanzee.neverland.effect;

import com.constanzee.neverland.Neverland;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static final StatusEffect BLOOD_SENSE;

    public ModStatusEffects() {
    }

    private static StatusEffect register(String id, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Neverland.MODID, id), effect);
    }

    static {
        BLOOD_SENSE = register("blood_sense", new ModStatusEffect(StatusEffectCategory.BENEFICIAL));
    }
}