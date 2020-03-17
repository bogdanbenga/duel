package me.guillaume.duel.equipment.weapons;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Axe extends Weapon {

    private static final int AXE_DAMAGE = 6;

    public Axe(final String name) {
        super(name, AXE_DAMAGE);
    }
}
