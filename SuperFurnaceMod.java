package com.exemplo.superfurnace;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperFurnaceMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("superfurnace");

    @Override
    public void onInitialize() {
        LOGGER.info("Super Fornalha (leve): fornalhas 4x mais rápidas!");
    }
}
