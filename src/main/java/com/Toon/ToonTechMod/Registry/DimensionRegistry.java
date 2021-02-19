package com.Toon.ToonTechMod.Registry;

import com.Toon.ToonTechMod.ToonTechMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.world.ForgeWorldType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionRegistry {
    public static final DeferredRegister<ForgeWorldType> ITEMS = DeferredRegister.create(ForgeRegistries.WORLD_TYPES, ToonTechMod.MODID);
}
