package com.xinecraft.helloallinone.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloAllinOneSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello, Spigot! This is a AllinOne Spigot plugin!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
