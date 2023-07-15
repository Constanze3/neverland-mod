package com.constanzee.neverland.item;

import com.constanzee.neverland.Neverland;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NEVERLAND;

    public ModItemGroups() {
    }

    private static ItemGroup.Builder create(String id) {
        return create(new Identifier(Neverland.MODID, id));
    }

    private static ItemGroup.Builder create(Identifier id) {
        return FabricItemGroup.builder(id);
    }

    static {
        NEVERLAND = create("neverland_group")
                .icon(() -> new ItemStack(Items.APPLE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.SILVER_INGOT);
                    entries.add(ModItems.SILVER_SWORD);
                    entries.add(ModItems.SILVER_AXE);
                    entries.add(ModItems.SILVER_ARROW);
                    entries.add(ModItems.BOTTLE_OF_WEREWOLF_BLOOD);
                    entries.add(ModItems.POTION_OF_BLOOD_SENSE);
                    entries.add(ModItems.ORB_OF_THE_STORM);
                    entries.add(ModItems.RUNE_BLOCK);
                })
                .build();
    }
}