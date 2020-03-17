package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class EquipmentFactory {

    public static final String ARMOR = "armor";
    public static final String SWORD = "sword";
    public static final String AXE = "axe";
    public static final String BUCKLER = "buckler";
    public static final String GREAT_SWORD = "great-sword";

    public static EquipmentInHand getEquipment(String equipmentName){
        switch (equipmentName){
            case SWORD:
                return new Sword(equipmentName);
            case AXE:
                return new Axe(equipmentName);
            case BUCKLER:
                return new Buckler(equipmentName);
            case GREAT_SWORD:
                return new GreatSword(equipmentName);
            default:
                throw new RuntimeException("Cannot create equipment with name: " + equipmentName);
        }
    }

}
