package com.velikiyprikalel.tntReplacer.handlers;

import com.velikiyprikalel.tntReplacer.TntReplacerMod;
import com.xeraster.supertnt.primedtnt.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.commons.lang3.NotImplementedException;

import java.util.Random;

public class EntityTNTPrimedSpawned {
    private static Random random = new Random();

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
            BlockPos tntPosition = e.getEntity().getPosition();

            e.setCanceled(true);

            Entity newTnt = spawnEntity(world, tntPosition);
            TntReplacerMod.logger.info("common TNT will be replaced with: " + newTnt.getName());
            world.spawnEntity(newTnt);
        }
    }

    private static Entity spawnEntity(World world, BlockPos tntSpawnPosition) {
        int i = random.nextInt(30);
        switch (i) {
            case 0:
                return new EntityTNTSnowPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 1:
                return new EntityTNTLargePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 2:
                return new EntityTNTMassivePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 3:
                return new EntityTNTFactPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 4:
                return new EntityTNTArrowPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 5:
                return new EntityTNTOceanPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 6:
                return new EntityTNTSpongePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 7:
                return new EntityTNTFirePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 8:
                return new EntityTNTWarpPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 9:
                return new EntityTNTCrapPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 10:
                return new EntityTNTCrap2Primed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 11:
                return new EntityTNTCavePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 12:
                return new EntityTNTDiamondNukePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 13:
                return new EntityTNTDiamondPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 14:
                return new EntityTNTNoMobPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 15:
                return new EntityTNTFlatPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 16:
                return new EntityTNTHousePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 17:
                return new EntityTNTClusterPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 18:
                return new EntityTNTHellPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 19:
                return new EntityTNTThunderPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 20:
                return new EntityTNTKimJongPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 21:
                return new EntityTNTTreePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 22:
                return new EntityTNTForestPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 23:
                return new EntityTNTLavaPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 24:
                return new EntityTNTIslandPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 25:
                return new EntityTNTWeatherPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 26:
                return new EntityTNTTimePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 27:
                return new EntityTNTRakePrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 28:
                return new EntityTNTLavaOceanPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
            case 29:
                return new EntityTNTTinyIslandPrimed(world, tntSpawnPosition.getX(), tntSpawnPosition.getY(), tntSpawnPosition.getZ(), null);
//            SUPER_TNT_ENTITY = new EntityEntry(EntityTNTSuperPrimed.class, "supertnt:super_tnt_primed");
//            DOOM_TNT_ENTITY = new EntityEntry(EntityTNTDoomPrimed.class, "supertnt:doom_tnt_primed");
//            END_TNT_ENTITY = new EntityEntry(EntityTNTEndPrimed.class, "supertnt:end_tnt_primed");
//            MOB_TNT_ENTITY = new EntityEntry(EntityTNTMobPrimed.class, "supertnt:mob_tnt_primed");
//            MOB2_TNT_ENTITY = new EntityEntry(EntityTNTMob2Primed.class, "supertnt:mob2_tnt_primed");
//            BIOME_TNT_ENTITY = new EntityEntry(EntityTNTBiomePrimed.class, "supertnt:biome_tnt_primed");
//            WAVE_TNT_ENTITY = new EntityEntry(EntityTNTWavePrimed.class, "supertnt:wave_tnt_primed");
//            MOB3_TNT_ENTITY = new EntityEntry(EntityTNTMob3Primed.class, "supertnt:mob3_tnt_primed");
//            EVERYTHING_TNT_ENTITY = new EntityEntry(EntityTNTEverythingPrimed.class, "supertnt:everything_tnt_primed");
//            MINE_TNT_ENTITY = new EntityEntry(EntityTNTMinePrimed.class, "supertnt:mine_tnt_primed");
//            NOSTALGIA_TNT_ENTITY = new EntityEntry(EntityTNTNostalgiaPrimed.class, "supertnt:nostalgia_tnt_primed");
//            SAVE_TNT_ENTITY = new EntityEntry(EntityTNTSavePrimed.class, "supertnt:save_tnt_primed");
//            SUPERCLUSTER_TNT_ENTITY = new EntityEntry(EntityTNTSuperClusterPrimed.class, "supertnt:supercluster_tnt_primed");
//            TRUMP_TNT_ENTITY = new EntityEntry(EntityTNTTrumpPrimed.class, "supertnt:trump_tnt_primed");
//            CRACK_TNT_ENTITY = new EntityEntry(EntityTNTCrackPrimed.class, "supertnt:crack_tnt_primed");
//            WEED_TNT_ENTITY = new EntityEntry(EntityTNTWeedPrimed.class, "supertnt:weed_tnt_primed");
//            WTF_TNT_ENTITY = new EntityEntry(EntityTNTWtfPrimed.class, "supertnt:wtf_tnt_primed");
//            BUNKER_TNT_ENTITY = new EntityEntry(EntityTNTBunkerPrimed.class, "supertnt:bunker_tnt_primed");
//            SINGULARITY_TNT_ENTITY = new EntityEntry(EntityTNTSingularityPrimed.class, "supertnt:singularity_tnt_primed");
//            PLEASENO_TNT_ENTITY = new EntityEntry(EntityTNTPleaseNoPrimed.class, "supertnt:pleaseno_tnt_primed");
//            LGBT_TNT_ENTITY = new EntityEntry(EntityTNTLGBTPrimed.class, "supertnt:lgbt_tnt_primed");
//            CHEESE_TNT_ENTITY = new EntityEntry(EntityTNTCheesePrimed.class, "supertnt:cheese_tnt_primed");
//            CHRISTMAS_TNT_ENTITY = new EntityEntry(EntityTNTChristmasPrimed.class, "supertnt:christmas_tnt_primed");
//            AIRBORNE_TNT_ENTITY = new EntityEntry(EntityTNTAirbornePrimed.class, "supertnt:airborne_tnt_primed");
//            JAIL_TNT_ENTITY = new EntityEntry(EntityTNTJailPrimed.class, "supertnt:jail_tnt_primed");
//            TELEPORT_TNT_ENTITY = new EntityEntry(EntityTNTTeleportPrimed.class, "supertnt:teleport_tnt_primed");
            default:
                throw new NotImplementedException("i must have correct value");
        }
    }
}