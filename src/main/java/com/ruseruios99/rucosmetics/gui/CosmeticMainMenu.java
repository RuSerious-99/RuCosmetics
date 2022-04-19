package com.ruseruios99.rucosmetics.gui;


import com.ruseruios99.rucosmetics.itemstack_utils.CreateItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CosmeticMainMenu {


    public CosmeticMainMenu(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.DARK_PURPLE + "Cosmetics Main Menu");

        inventory.addItem(CreateItemStacks.createCosmeticSkullMain());
        inventory.addItem(CreateItemStacks.createCosmeticTrailMain());

        player.openInventory(inventory);
    }



}
