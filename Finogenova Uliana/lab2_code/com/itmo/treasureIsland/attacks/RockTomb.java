package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {

    public RockTomb () {
        super (Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect lowerDef = new Effect().stat(Stat.DEFENSE, -1);
        pok.setCondition(lowerDef);
    }

    @Override
    protected String describe() {
        return "понижает защиту своего противника";
    }
}

