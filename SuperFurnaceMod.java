package com.exemplo.superfurnace;

import com.exemplo.superfurnace.block.SuperFurnaceBlock;
import com.exemplo.superfurnace.block.entity.SuperFurnaceBlockEntity;
import com.exemplo.superfurnace.screen.SuperFurnaceScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperFurnaceMod implements ModInitializer {
    public static final String MOD_ID = "superfurnace";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final SuperFurnaceBlock SUPER_FURNACE_BLOCK =
            new SuperFurnaceBlock(AbstractBlock.Settings.copy(Blocks.FURNACE));

    public static final BlockItem SUPER_FURNACE_ITEM =
            new BlockItem(SUPER_FURNACE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static final BlockEntityType<SuperFurnaceBlockEntity> SUPER_FURNACE_BE =
            BlockEntityType.Builder.create(SuperFurnaceBlockEntity::new, SUPER_FURNACE_BLOCK).build(null);

    public static final ScreenHandlerType<SuperFurnaceScreenHandler> SUPER_FURNACE_SH =
            new ScreenHandlerType<>(SuperFurnaceScreenHandler::new);

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, id("super_furnace"), SUPER_FURNACE_BLOCK);
        Registry.register(Registry.ITEM, id("super_furnace"), SUPER_FURNACE_ITEM);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, id("super_furnace"), SUPER_FURNACE_BE);
        Registry.register(Registry.SCREEN_HANDLER, id("super_furnace"), SUPER_FURNACE_SH);
        LOGGER.info("Super Fornalha carregada!");
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
