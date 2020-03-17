package me.guillaume.duel;

import me.guillaume.duel.equipment.EquipmentFactory;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Viking extends Fighter{

    private static final int VIKING_INITIAL_HIT_POINTS = 120;

    public Viking() {
        super(VIKING_INITIAL_HIT_POINTS);
        equip(EquipmentFactory.AXE);
    }

    @Override
    public Viking equip(String equipmentName){
        return (Viking) super.equip(equipmentName);
    }
}


