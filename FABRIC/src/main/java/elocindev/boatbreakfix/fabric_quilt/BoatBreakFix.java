package elocindev.boatbreakfix.fabric_quilt;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoatBreakFix implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("BoatBreakFix");

	@Override
	public void onInitialize() {
		LOGGER.info("BoatBreakFix initialized");
	}
}