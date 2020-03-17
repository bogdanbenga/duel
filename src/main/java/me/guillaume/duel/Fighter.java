package me.guillaume.duel;

import me.guillaume.duel.controller.Equipable;
import me.guillaume.duel.equipment.EquipmentFactory;
import me.guillaume.duel.equipment.DamageFactory;
import me.guillaume.duel.equipment.EquipmentInHand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class Fighter implements Equipable {

    private static final String ARMOR = "armor";
    private int hitPoints;
    private boolean armored;
    private List<EquipmentInHand> equipmentList;

    public Fighter(final int hitPoints) {
        this.hitPoints = hitPoints;
        equipmentList = new ArrayList<>();
    }

    @Override
    public Fighter equip(String equipmentName) {

        if (equipmentName.equals(ARMOR)){
            armored = true;
        } else {
            equipmentList.add(EquipmentFactory.getEquipment(equipmentName));
        }
        return this;
    }

    public void engage(final Fighter opponent) {
        int damage = DamageFactory.getDamage(this, opponent);

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

    public void setEquipmentList(final List<EquipmentInHand> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
