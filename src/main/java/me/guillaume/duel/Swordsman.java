package me.guillaume.duel;

import me.guillaume.duel.equipment.EquipmentFactory;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Swordsman extends Fighter {

    private static final int SWORDSMAN_INITIAL_HIT_POINTS = 100;


    public Swordsman(final String vicious) {
        super(SWORDSMAN_INITIAL_HIT_POINTS);
    }

    public Swordsman() {
        super(SWORDSMAN_INITIAL_HIT_POINTS);
        equip(EquipmentFactory.SWORD);
    }

    @Override
    public Swordsman equip(String equipmentName){
        return (Swordsman) super.equip(equipmentName);
    }

}
