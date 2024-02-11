package com.velikiyprikalel.tntReplacer.handlers;

import com.velikiyprikalel.tntReplacer.TntReplacerMod;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityTNTPrimedSpawned {
    @SubscribeEvent
    public void onTNTPrimedSpawned(EntityJoinWorldEvent e) {
        World world = e.getWorld();
        if (world.isRemote) {
            return;
        }

        if (e.isCanceled()) {
            return;
        }

        if (e.getEntity() instanceof EntityTNTPrimed) {
            EntityTNTPrimed tntEntity = (EntityTNTPrimed)e.getEntity();
            TntReplacerMod.logger.info("TNT placed, name: " + e.getEntity());
        }
    }
}