package com.constanzee.neverland.item;

import com.constanzee.neverland.Neverland;
import com.constanzee.neverland.block.ModBlocks;
import com.constanzee.neverland.effect.ModStatusEffects;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item SILVER_INGOT;
    public static Item SILVER_SWORD;
    public static Item SILVER_AXE;
    public static Item SILVER_ARROW;
    public static Item BOTTLE_OF_WEREWOLF_BLOOD;
    public static Item POTION_OF_BLOOD_SENSE;
    public static Item ORB_OF_THE_STORM;
    public static Item RUNE_BLOCK;
    public static Item SPEAR;

    private static Item register(Block block) {
        return Registry.register(Registries.ITEM, Registries.BLOCK.getId(block), new BlockItem(block, new Item.Settings()));
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Neverland.MODID, id), item);
    }

    public static void register() {
        SILVER_INGOT = register("silver_ingot", new Item(new Item.Settings().maxCount(20)));
        SILVER_SWORD = register("silver_sword", new SwordItem(ModToolMaterials.SILVER, 3, -2.4F, new Item.Settings()));
        SILVER_AXE = register("silver_axe", new AxeItem(ModToolMaterials.SILVER, 6.0f, -3.1f, new Item.Settings()));
        SILVER_ARROW = register("silver_arrow", new SilverArrowItem(new Item.Settings()));
        BOTTLE_OF_WEREWOLF_BLOOD = register("bottle_of_werewolf_blood", new ModPotionItem(new StatusEffectInstance(StatusEffects.NAUSEA, 200), false, new Item.Settings().maxCount(1)));
        POTION_OF_BLOOD_SENSE = register("potion_of_blood_sense", new ModPotionItem(new StatusEffectInstance(ModStatusEffects.BLOOD_SENSE, 6000), true, new Item.Settings().maxCount(1)));
        ORB_OF_THE_STORM = register("orb_of_the_storm", new EnchantedItem(new Item.Settings()));
        RUNE_BLOCK = register(ModBlocks.RUNE_BLOCK);
        SPEAR = register("spear", new Item(new Item.Settings()));
    }
}