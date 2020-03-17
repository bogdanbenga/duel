package me.guillaume.duel.equipment.weapons;

import me.guillaume.duel.Fighter;
import me.guillaume.duel.equipment.Equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class DamageFactory {

    public static int getDamage(Fighter attacker, Fighter opponent) {
        int damage = 0;

        for (Equipment equipment : attacker.getEquipmentList()) {
            if (equipment instanceof Weapon){
                damage += ((Weapon) equipment).getDamage();
            }
        }
        return damage;
    }

}
