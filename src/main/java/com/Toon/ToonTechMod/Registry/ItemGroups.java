package com.Toon.ToonTechMod.Registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public abstract class ItemGroups {
    public static final ItemGroup TOONTECHMOD =  new ItemGroup(12, "toontechmod") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.EXAMPLE_ITEM.get());
        }
    };
}
