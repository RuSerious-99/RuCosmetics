package com.ruseruios99.rucosmetics.gui.skulls;


import com.ruseruios99.rucosmetics.RuCosmetics;
import com.ruseruios99.rucosmetics.itemstack_utils.CreateItemStackSkulls;
import com.ruseruios99.rucosmetics.mini_manager.Cosmetic;
import org.bukkit.entity.Player;

public class Skull extends Cosmetic {

    private final SkullType skullType;

    public Skull(RuCosmetics cosmetics, Player player, SkullType skullType) {
        super(cosmetics, player);
        this.skullType = skullType;
    }

    @Override
    public void enable() {
        player.getInventory().setHelmet(CreateItemStackSkulls.makeItemstack(skullType));
    }

    @Override
    public void disable() {
        player.getInventory().setHelmet(null);

    }

    public SkullType getSkullType() {
        return skullType;
    }
}
