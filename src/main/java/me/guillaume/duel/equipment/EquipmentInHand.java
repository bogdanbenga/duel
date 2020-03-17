package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class EquipmentInHand {

    private int damage;
    private String name;

    public EquipmentInHand(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
