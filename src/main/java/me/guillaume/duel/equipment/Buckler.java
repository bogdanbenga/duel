package me.guillaume.duel.equipment;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Buckler extends EquipmentInHand {

    private boolean blockedLastTime;
    private int remainingBlocks;

    public Buckler(String name) {
        super(name, 0);
        remainingBlocks = 3;
    }

    public boolean block(boolean blocksAxe){
        if (remainingBlocks <= 0){
            //it is already destroyed
            return false;
        }

        if (!blockedLastTime && blocksAxe){
            remainingBlocks -= 1;
        }
        blockedLastTime = !blockedLastTime;
        return blockedLastTime;
    }
}
