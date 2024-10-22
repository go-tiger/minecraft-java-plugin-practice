package dev.gotiger.pluginPractice;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginPractice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("플러그인 활성화!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 비활성화!");
    }
}
