package com.constanzee.neverland.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedItem extends Item {

    public EnchantedItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
