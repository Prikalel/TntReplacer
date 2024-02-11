package com.velikiyprikalel.tntReplacer;

import com.velikiyprikalel.tntReplacer.proxy.BaseProxy;
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
    public static final String MOD_ID = "tntReplacer";
    public static final String NAME = "TNT Replacer";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @SidedProxy(clientSide = "com.velikiyprikalel.tntReplacer.proxy.ClientProxy", serverSide = "com.velikiyprikalel.tntReplacer.proxy.ServerProxy")
    private static BaseProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}