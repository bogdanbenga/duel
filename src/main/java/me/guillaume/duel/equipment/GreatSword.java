package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class GreatSword extends EquipmentInHand {

    private static final int SWORD_DAMAGE = 12;
    private int usageContor;

    public GreatSword(String name) {
        super(name, SWORD_DAMAGE);
    }

    public int use(){
        return ++usageContor;
    }
}
