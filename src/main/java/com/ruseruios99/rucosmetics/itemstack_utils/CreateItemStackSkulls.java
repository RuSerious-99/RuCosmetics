package com.ruseruios99.rucosmetics.itemstack_utils;


import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.ruseruios99.rucosmetics.gui.skulls.SkullType;
import com.ruseruios99.rucosmetics.gui.skulls.SkullsUi;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import java.util.UUID;

public class CreateItemStackSkulls {

    public static ItemStack makeItemstack(SkullType skullType) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD);

        SkullMeta meta = (SkullMeta) skull.getItemMeta();

        PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
        profile.getProperties().add(new ProfileProperty("textures", skullType.getTextureString()));
        meta.setPlayerProfile(profile);

        meta.setDisplayName(skullType.getDisplay() + " " + (SkullsUi.active.contains(skullType) ? ChatColor.RED + "Click to Disable" : ChatColor.GREEN + "Click to Enable"));
        meta.setLore(skullType.getDescription());
        meta.setLocalizedName(skullType.name());
        skull.setItemMeta(meta);
        return skull;
    }
}
