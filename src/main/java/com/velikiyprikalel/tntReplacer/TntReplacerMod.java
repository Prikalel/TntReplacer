package com.velikiyprikalel.tntReplacer;

import com.velikiyprikalel.tntReplacer.handlers.EntityTNTPrimedSpawned;
import com.velikiyprikalel.tntReplacer.proxy.BaseProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = TntReplacerMod.MOD_ID, name = TntReplacerMod.NAME, version = TntReplacerMod.VERSION)
public class TntReplacerMod {
    public static final String MOD_ID = "tntreplacer";
    public static final String NAME = "TNT Replacer";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @SidedProxy(clientSide = "com.velikiyprikalel.tntReplacer.proxy.ClientProxy", serverSide = "com.velikiyprikalel.tntReplacer.proxy.ServerProxy")
    private static BaseProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.warn("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        MinecraftForge.EVENT_BUS.register(new EntityTNTPrimedSpawned());
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}