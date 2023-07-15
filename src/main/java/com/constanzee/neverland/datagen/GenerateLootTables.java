package com.constanzee.neverland.datagen;

import com.constanzee.neverland.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class GenerateLootTables {

    private static LootTable.Builder tableBuilder;

    private static void buildPool(Item item, float chance, float maxAmount) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance).build())
                .with(ItemEntry.builder(item))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, maxAmount)).build());

        tableBuilder.pool(poolBuilder.build());
    }

    public static void register() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            GenerateLootTables.tableBuilder = tableBuilder;

            if (source.isBuiltin()) {
                if (id.equals(LootTables.SIMPLE_DUNGEON_CHEST) || id.equals(LootTables.DESERT_PYRAMID_CHEST) || id.equals(LootTables.JUNGLE_TEMPLE_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.2f, 1f);
                    buildPool(ModItems.SILVER_INGOT, 0.3f, 2f);
                }
                else if (id.equals(LootTables.VILLAGE_WEAPONSMITH_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.2f, 1f);
                    buildPool(ModItems.SILVER_INGOT, 0.7f, 3f);
                }
                else if (id.equals(LootTables.ABANDONED_MINESHAFT_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.3f, 1f);
                    buildPool(ModItems.SILVER_INGOT, 0.4f, 2f);
                }
                else if (id.equals(LootTables.STRONGHOLD_CROSSING_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.2f, 1f);
                    buildPool(ModItems.SILVER_INGOT, 0.1f, 2f);
                }
                else if (id.equals(LootTables.WOODLAND_MANSION_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.2f, 1f);
                }
                else if (id.equals(LootTables.UNDERWATER_RUIN_SMALL_CHEST)) {
                    buildPool(ModItems.SILVER_INGOT, 0.4f, 2f);
                }
                else if (id.equals(LootTables.SHIPWRECK_TREASURE_CHEST)) {
                    buildPool(ModItems.SILVER_SWORD, 0.3f, 1f);
                    buildPool(ModItems.SILVER_INGOT, 0.2f, 2f);
                }
            }
        });
    }
}
