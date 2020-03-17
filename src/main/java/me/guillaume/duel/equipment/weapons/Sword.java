package me.guillaume.duel.equipment.weapons;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Sword extends Weapon {

    private static final int SWORD_DAMAGE = 5;

    public Sword(final String name) {
        super(name, SWORD_DAMAGE);
    }
}
