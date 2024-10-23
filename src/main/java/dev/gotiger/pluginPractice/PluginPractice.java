package dev.gotiger.pluginPractice;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class PluginPractice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        String path = "test.yml";
        File newFile = new File(getDataFolder(), path);
        if (!newFile.exists() && getResource(path) != null) {
            saveResource(path, false);
        }
        FileConfiguration config = YamlConfiguration.loadConfiguration(newFile);

        getLogger().info("플러그인 활성화!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 비활성화!");
    }
}
