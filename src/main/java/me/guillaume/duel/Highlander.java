package me.guillaume.duel;

import me.guillaume.duel.equipment.EquipmentFactory;

import java.util.logging.Logger;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Highlander extends Fighter{

    private static final Logger LOGGER = Logger.getLogger(Highlander.class.getName());
    private static final int HIGHLANDER_INITIAL_HIT_POINTS = 150;

    public Highlander() {
        super(HIGHLANDER_INITIAL_HIT_POINTS);
        equip(EquipmentFactory.GREAT_SWORD);
    }

    public Highlander(final String veteran) {
        super(HIGHLANDER_INITIAL_HIT_POINTS);
    }

    @Override
    public Highlander equip(String equipmentName){
        return (Highlander) super.equip(equipmentName);
    }
}
