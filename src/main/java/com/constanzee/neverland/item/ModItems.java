package com.constanzee.neverland.item;

import com.constanzee.neverland.Main;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /*
    public static final Item BOTTLE_OF_WEREWOLF_BLOOD;
    public static final Item KATANA;
    public static final Item POTION_OF_BLOOD_SENSE;
    */

    public static final Item SILVER_INGOT;
    public static final Item SILVER_SWORD;
    public static final Item SILVER_AXE;
    public static final Item SPEAR;
    public static final Item UMBRELLA;

    public ModItems() {
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MODID, id), item);
    }

    static {
        SILVER_INGOT = register("silver_ingot", new Item(new Item.Settings()));
        SILVER_SWORD = register("silver_sword", new SwordItem(ModToolMaterials.SILVER, 3,-2.4F, new Item.Settings()));
        SILVER_AXE = register("silver_axe", new AxeItem(ToolMaterials.DIAMOND, 6.0f, -3.1f, new Item.Settings().maxCount(20)));
        SPEAR = register("spear", new Item(new Item.Settings()));
        UMBRELLA = register("umbrella", new Item(new Item.Settings().maxDamage(1000)));
    }
}