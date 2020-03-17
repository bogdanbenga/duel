package me.guillaume.duel.equipment;

import me.guillaume.duel.Fighter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class DamageFactory {

    public static int getDamage(Fighter attacker, Fighter opponent) {
        int damage = 0;
        boolean blocked = isBlocked(hasAxe(attacker), opponent);

        if (blocked) {
            return 0;
        }

        for (EquipmentInHand equipment : attacker.getEquipmentList()) {
                damage +=  equipment.getDamage();
        }
        return damage;
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
