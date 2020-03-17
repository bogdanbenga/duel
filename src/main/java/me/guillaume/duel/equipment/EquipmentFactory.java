package me.guillaume.duel.equipment;

import me.guillaume.duel.equipment.weapons.Axe;
import me.guillaume.duel.equipment.weapons.Sword;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class EquipmentFactory {

    public static final String SWORD = "sword";
    public static final String AXE = "axe";

    public static Equipment getEquipment(String equipmentName){
        switch (equipmentName){
            case SWORD:
                return new Sword(SWORD);
            case AXE:
                return new Axe(AXE);
            default:
                throw new RuntimeException("Cannot create equipment with name: " + equipmentName);
        }
    }

}
