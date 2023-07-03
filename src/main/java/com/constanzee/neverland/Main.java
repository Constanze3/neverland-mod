package com.constanzee.neverland;

import com.constanzee.neverland.item.ModItemGroups;
import com.constanzee.neverland.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main implements ModInitializer {
	public static final String MODID = "neverland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		new ModItems();
		new ModItemGroups();
	}
}