package me.guillaume.duel.equipment.weapons;

import me.guillaume.duel.controller.Equipable;
import me.guillaume.duel.equipment.Equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class Weapon extends Equipment {

    private int damage;

    public Weapon(final String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
