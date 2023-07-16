package com.constanzee.neverland;

import com.constanzee.neverland.block.ModBlocks;
import com.constanzee.neverland.datagen.GenerateLootTables;
import com.constanzee.neverland.effect.ModStatusEffects;
import com.constanzee.neverland.entity.ModEntityType;
import com.constanzee.neverland.item.ModDispenserBehavior;
import com.constanzee.neverland.item.ModItemGroups;
import com.constanzee.neverland.item.ModItems;
import com.constanzee.neverland.sound.ModSoundEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.io.StringWriter;


public class Neverland implements ModInitializer {
	public static final String MODID = "neverland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static void logException(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		String stackTrace = sw.toString();
		LOGGER.error(stackTrace);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Neverland mod!");

		ModSoundEvents.register();
		ModStatusEffects.register();
		ModEntityType.register();
		ModBlocks.register();
		ModItems.register();
		ModDispenserBehavior.register();
		ModItemGroups.register();
		GenerateLootTables.register();
	}
}