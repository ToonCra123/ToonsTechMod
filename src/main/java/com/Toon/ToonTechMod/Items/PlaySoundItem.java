package com.Toon.ToonTechMod.Items;

import com.Toon.ToonTechMod.Registry.ItemGroups;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlaySoundItem extends Item {

    public SoundEvent sound;

    public PlaySoundItem(Properties properties, SoundEvent soundIn) {
        super(properties
                .group(ItemGroups.TOONTECHMOD)
                .isImmuneToFire()
        );
        this.sound = soundIn;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        BlockPos pos = playerIn.getPosition();

        try {
            worldIn.playSound(playerIn, pos, this.sound, SoundCategory.HOSTILE, 1f, 1f);
            return ActionResult.resultSuccess(playerIn.getHeldItemMainhand());
        } catch(Exception e) {
            return ActionResult.resultFail(playerIn.getHeldItemMainhand());
        }
    }
}
