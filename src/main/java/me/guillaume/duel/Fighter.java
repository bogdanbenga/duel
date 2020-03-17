package me.guillaume.duel;

import me.guillaume.duel.equipment.EquipmentFactory;
import me.guillaume.duel.equipment.DamageCalculator;
import me.guillaume.duel.equipment.EquipmentInHand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class Fighter {

    private int hitPoints;
    private boolean armored;
    private List<EquipmentInHand> equipmentList;

    public Fighter(final int hitPoints) {
        this.hitPoints = hitPoints;
        equipmentList = new ArrayList<>();
    }

    public Fighter equip(String equipmentName) {

        if (equipmentName.equals(EquipmentFactory.ARMOR)){
            armored = true;
        } else {
            equipmentList.add(EquipmentFactory.getEquipment(equipmentName));
        }
        return this;
    }

    public void engage(final Fighter opponent) {
        int damage = DamageCalculator.getDamage(this, opponent);

        if (opponent.hitPoints <= damage) {
            opponent.hitPoints = 0;
        } else {
            opponent.hitPoints -= damage;
            opponent.engage(this);
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    public List<EquipmentInHand> getEquipmentList() {
        return equipmentList;
    }

    public boolean isArmored() {
        return armored;
    }

    public void setEquipmentList(final List<EquipmentInHand> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
