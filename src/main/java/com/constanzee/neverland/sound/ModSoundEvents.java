package com.constanzee.neverland.sound;

import com.constanzee.neverland.Neverland;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final SoundEvent SPECIAL_EVIL_LAUGHTER;

    private static SoundEvent register(String id) {
        return register(new Identifier(Neverland.MODID, id));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    static {
        SPECIAL_EVIL_LAUGHTER = register("special.evil_laughter");
    }
}