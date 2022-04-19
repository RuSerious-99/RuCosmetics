package com.ruseruios99.rucosmetics.itemstack_utils;


import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.ruseruios99.rucosmetics.gui.skulls.SkullsUi;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class CreateItemStacks {


    public static ItemStack createCosmeticSkullMain() {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);

        SkullMeta meta = (SkullMeta) skull.getItemMeta();

        PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
        profile.getProperties().add(new ProfileProperty("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDg2NWEzODNhNGRjYTA4YzVkYWFiNmFjZTQxMTc3MjA5NWVlNjMyN2MxMjI3MDNhMjIyNDQyZjIxNDFjMmMzZCJ9fX0="));
        meta.setPlayerProfile(profile);

        meta.setDisplayName(ChatColor.DARK_PURPLE + "COSMETIC SKULLS");

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + " ");
        lore.add("Put them on to Enjoy the look");
        lore.add("To give you a visual override");
        lore.add(" ");
        meta.setLore(lore);
        skull.setItemMeta(meta);

        return skull;
    }

    public static ItemStack createCosmeticTrailMain() {
        ItemStack trail = new ItemStack(Material.PLAYER_HEAD);

        SkullMeta meta = (SkullMeta) trail.getItemMeta();

        PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
        profile.getProperties().add(new ProfileProperty("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjk3NTRlYjJlMTgxZTQ3MTRmMzNlMTlhZjdkM2MyYWI0YjYxNTFmMGVkNGEzYmM4NTZjMmY4Mjg5OGZmYjhkYiJ9fX0="));
        meta.setPlayerProfile(profile);

        meta.setDisplayName(ChatColor.DARK_PURPLE + "COSMETIC TRAILS");

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.WHITE + " ");
        lore.add("Put them on to Enjoy the look");
        lore.add("To give you a visual override");
        lore.add(" ");
        meta.setLore(lore);
        trail.setItemMeta(meta);

        return trail;
    }
}


