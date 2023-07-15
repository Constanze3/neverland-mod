package com.constanzee.neverland;

import com.constanzee.neverland.datagen.GenerateLootTables;
import com.constanzee.neverland.effect.ModStatusEffects;
import com.constanzee.neverland.entity.ModEntityType;
import com.constanzee.neverland.item.ModItemGroups;
import com.constanzee.neverland.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Neverland implements ModInitializer {
	public static final String MODID = "neverland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Neverland mod!");

		new ModItems();
		new ModItemGroups();
		new ModStatusEffects();
		new ModEntityType();

		GenerateLootTables.register();
	}
}