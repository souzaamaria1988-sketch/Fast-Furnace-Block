package com.exemplo.superfurnace.block.entity;

import com.exemplo.superfurnace.SuperFurnaceMod;
import com.exemplo.superfurnace.screen.SuperFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class SuperFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public SuperFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(SuperFurnaceMod.SUPER_FURNACE_BE, pos, state, RecipeType.SMELTING);
    }

    // Vanilla: 200 ticks (10s). Aqui: divide por 4 = 50 ticks (2,5s).
    // Mude o "/ 4" para ajustar a velocidade.
    @Override
    protected int getCookTime(DefaultedList<ItemStack> slots) {
        return Math.max(1, super.getCookTime(slots) / 4);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("block.superfurnace.super_furnace");
    }

    @Override
    protected AbstractFurnaceScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SuperFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
