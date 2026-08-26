package com.exemplo.superfurnace.block;

import com.exemplo.superfurnace.block.entity.SuperFurnaceBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SuperFurnaceBlock extends AbstractFurnaceBlock {

    public SuperFurnaceBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SuperFurnaceBlockEntity(pos, state);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof SuperFurnaceBlockEntity superFurnace) {
            player.openHandledScreen(superFurnace);
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }
}
