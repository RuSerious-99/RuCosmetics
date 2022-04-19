package com.ruseruios99.rucosmetics.mini_manager;

import com.ruseruios99.rucosmetics.RuCosmetics;
import org.bukkit.entity.Player;

public abstract class Cosmetic {

    protected RuCosmetics cosmetics;
    protected Player player;

    public Cosmetic(RuCosmetics cosmetics, Player player) {
        this.cosmetics = cosmetics;
        this.player = player;
    }

    public abstract void enable();
    public abstract void disable();


}
