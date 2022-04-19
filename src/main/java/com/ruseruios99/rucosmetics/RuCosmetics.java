package com.ruseruios99.rucosmetics;

import com.ruseruios99.rucosmetics.commands.CosmeticsCommands;
import com.ruseruios99.rucosmetics.itemstack_utils.CreateItemStacks;
import com.ruseruios99.rucosmetics.listeners.CosmeticsListener;
import com.ruseruios99.rucosmetics.mini_manager.Cosmetic;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class RuCosmetics extends JavaPlugin {

    private final HashMap<UUID, List<Cosmetic>> activeCosmetic = new HashMap<>();

    @Override
    public void onEnable() {
        getCommand("cosmetics").setExecutor(new CosmeticsCommands());
        Bukkit.getPluginManager().registerEvents(new CosmeticsListener(this), this);
    }


    public HashMap<UUID, List<Cosmetic>> getActiveCosmetic() {
        return activeCosmetic;
    }
}
