package me.guillaume.duel.controller;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public interface Engagable {

    void engage(Engagable opponent);
    int hitPoints();

}
