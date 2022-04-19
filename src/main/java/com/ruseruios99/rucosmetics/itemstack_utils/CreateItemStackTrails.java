package com.ruseruios99.rucosmetics.itemstack_utils;


import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.ruseruios99.rucosmetics.gui.trails.TrailsType;
import com.ruseruios99.rucosmetics.gui.trails.TrailsUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

public class CreateItemStackTrails {


    public static ItemStack makeItemstack(TrailsType trailsType) {
        ItemStack trail = new ItemStack(Material.PLAYER_HEAD);

        SkullMeta meta = (SkullMeta) trail.getItemMeta();

        PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
        profile.getProperties().add(new ProfileProperty("textures", trailsType.getTextureString()));
        meta.setPlayerProfile(profile);

        meta.setDisplayName(trailsType.getDisplay() + " " + (TrailsUI.active.contains(trailsType) ? ChatColor.RED + "Click to Disable" : ChatColor.GREEN + "Click to Enable"));
        meta.setLore(trailsType.getDescription());
        meta.setLocalizedName(trailsType.name());
        trail.setItemMeta(meta);
        return trail;
    }
}