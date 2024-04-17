package com.xinecraft.helloallinone.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "helloallinone",
        name = "HelloAllinOneVelocity",
        version = BuildConstants.VERSION
)
public class HelloAllinOneVelocity {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Hello, Velocity!, This is a AllinOne plugin");
    }
}
