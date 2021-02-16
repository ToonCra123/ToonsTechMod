package com.Toon.ToonTechMod.Registry;

import com.Toon.ToonTechMod.ToonTechMod;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesRegistry {
    public static void init() {
        TILE_ENTITIES_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ToonTechMod.MODID);

}
