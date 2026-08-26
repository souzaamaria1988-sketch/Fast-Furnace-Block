package com.exemplo.superfurnace.screen;

import com.exemplo.superfurnace.SuperFurnaceMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;

public class SuperFurnaceScreenHandler extends AbstractFurnaceScreenHandler {

    public SuperFurnaceScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(3), new ArrayPropertyDelegate(4));
    }

    public SuperFurnaceScreenHandler(int syncId, PlayerInventory playerInventory,
                                     Inventory inventory, PropertyDelegate propertyDelegate) {
        super(SuperFurnaceMod.SUPER_FURNACE_SH, RecipeType.SMELTING, RecipeBookCategory.FURNACE,
                syncId, playerInventory, inventory, propertyDelegate);
    }
}
