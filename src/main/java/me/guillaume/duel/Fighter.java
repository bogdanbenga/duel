package me.guillaume.duel;

import me.guillaume.duel.controller.Engagable;
import me.guillaume.duel.controller.Equipable;
import me.guillaume.duel.equipment.Equipment;
import me.guillaume.duel.equipment.EquipmentFactory;
import me.guillaume.duel.equipment.weapons.DamageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public abstract class Fighter implements Equipable, Engagable {

    private int hitPoints;
    private List<Equipment> equipmentList;

    public Fighter(final int hitPoints) {
        this.hitPoints = hitPoints;
        equipmentList = new ArrayList<>();
    }

    @Override
    public Fighter equip(String equipmentName) {
        equipmentList.add(EquipmentFactory.getEquipment(equipmentName));
        return this;
    }

    @Override
    public void engage(final Engagable opponent) {
        if (opponent instanceof Fighter) {
            engageFighter((Fighter) opponent);
        }


    }

    private void engageFighter(final Fighter opponent) {
        int damage = DamageFactory.getDamage(this, opponent);
        if (opponent.hitPoints <= damage) {
            opponent.hitPoints = 0;
        } else {
            opponent.hitPoints -= damage;
            opponent.engage(this);
        }
    }

    @Override
    public int hitPoints() {
        return hitPoints;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(final List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
