package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.PSYCHIC, 0, 100);
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