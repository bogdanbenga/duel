package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Sword extends EquipmentInHand {

    private static final int SWORD_DAMAGE = 5;

    public Sword(String name) {
        super(name, SWORD_DAMAGE);
    }
}
