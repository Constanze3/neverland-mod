package com.constanzee.neverland.item;

import com.constanzee.neverland.Neverland;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup NEVERLAND;

    public static void register() {
        NEVERLAND = FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.APPLE))
                .displayName(Text.translatable("itemGroup.neverland.neverland_group"))
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

        Registry.register(Registries.ITEM_GROUP, new Identifier("neverland", "neverland_group"), NEVERLAND);
    }
}