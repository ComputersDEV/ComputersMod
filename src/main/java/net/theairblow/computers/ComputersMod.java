package net.theairblow.computers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ComputersMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public ComputersMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void init(final FMLClientSetupEvent event) {
        // Initialization
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	LOGGER.error("Sorry, currently servers are not supported by this mod.");
        event.getServer().initiateShutdown(true);
    }
}
