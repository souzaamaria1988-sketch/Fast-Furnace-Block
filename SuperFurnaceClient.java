package com.exemplo.superfurnace;

import com.exemplo.superfurnace.screen.SuperFurnaceScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class SuperFurnaceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(SuperFurnaceMod.SUPER_FURNACE_SH, SuperFurnaceScreen::new);
    }
}
