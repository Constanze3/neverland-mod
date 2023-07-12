package com.constanzee.neverland.item;

import com.constanzee.neverland.Main;
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
        return create(new Identifier(Main.MODID, id));
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
                    entries.add(ModItems.UMBRELLA);
                })
                .build();
    }
}