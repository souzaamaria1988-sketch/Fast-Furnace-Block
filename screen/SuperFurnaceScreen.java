package com.exemplo.superfurnace.screen;

import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

public class SuperFurnaceScreen extends AbstractFurnaceScreen<SuperFurnaceScreenHandler> {

    public SuperFurnaceScreen(SuperFurnaceScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title, new FurnaceRecipeBookScreen());
    }
}
