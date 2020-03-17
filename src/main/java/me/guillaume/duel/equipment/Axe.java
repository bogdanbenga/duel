package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Axe extends EquipmentInHand {

    private static final int AXE_DAMAGE = 6;

    public Axe(String name) {
        super(name, AXE_DAMAGE);
    }
}
