package me.guillaume.duel.equipment;

import me.guillaume.duel.Fighter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class DamageCalculator {

    public static int getDamage(Fighter attacker, Fighter opponent) {
        int damage = 0;

        boolean isResting = isResting(attacker);
        boolean blocked = false;
        if (!isResting){
            blocked = isBlocked(hasAxe(attacker), opponent);
        }

        if (blocked || isResting) {
            return 0;
        }

        for (EquipmentInHand equipment : attacker.getEquipmentList()) {
            damage += equipment.getDamage();
        }

        if (attacker.isArmored()) {
            damage -= 1;
        }

        if (opponent.isArmored()) {
            damage -= 3;
        }

        return damage >= 0 ? damage : 0;
    }

    private static boolean isResting(final Fighter attacker) {
        for (EquipmentInHand equipment : attacker.getEquipmentList()) {
            if (equipment.getName().equals(EquipmentFactory.GREAT_SWORD)) {
                return ((GreatSword) equipment).use() % 3 == 0;
            }
        }
        return false;
    }

    private static boolean hasAxe(final Fighter attacker) {
        for (EquipmentInHand equipment : attacker.getEquipmentList()) {
            if (equipment.getName().equals(EquipmentFactory.AXE)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isBlocked(boolean hasAxe, final Fighter opponent) {
        boolean blocked = false;
        for (EquipmentInHand equipment : opponent.getEquipmentList()) {
            if (equipment instanceof Buckler) {
                blocked = ((Buckler) equipment).block(hasAxe);
            }
        }
        return blocked;
    }

}
