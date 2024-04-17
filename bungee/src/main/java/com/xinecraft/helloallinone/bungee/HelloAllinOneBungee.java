package com.xinecraft.helloallinone.bungee;

import net.md_5.bungee.api.plugin.Plugin;

public final class HelloAllinOneBungee extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello, BungeeCord! This is a AllinOne BungeeCord plugin!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
