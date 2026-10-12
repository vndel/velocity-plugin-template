package com.fivemcodehub.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(id = "exampleproxy", name = "ExampleProxy", version = "1.0.0")
public final class ExampleProxyPlugin {
    private final Logger logger;
    @Inject public ExampleProxyPlugin(Logger logger) { this.logger = logger; }
    @Subscribe public void onInitialize(ProxyInitializeEvent event) {
        logger.info("ExampleProxy initialized");
    }
}
