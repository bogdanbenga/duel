package me.guillaume.duel;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Swordsman extends Fighter {

    private static final int SWORDSMAN_INITIAL_HIT_POINTS = 100;


    public Swordsman(final String vicious) {
        super(SWORDSMAN_INITIAL_HIT_POINTS);
        equip("sword");
    }

    public Swordsman() {
        super(SWORDSMAN_INITIAL_HIT_POINTS);
        equip("sword");
    }

    @Override
    public Swordsman equip(String equipmentName){
        return (Swordsman) super.equip(equipmentName);
    }

}
