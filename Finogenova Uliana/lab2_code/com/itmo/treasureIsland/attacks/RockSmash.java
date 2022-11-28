package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class RockSmash extends PhysicalMove {

    public RockSmash () {
        super (Type.FIGHTING, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect lowerDef = new Effect().stat(Stat.DEFENSE, -1).chance(0.5);
        pok.setCondition(lowerDef);
    }

    @Override
    protected String describe() {
        return "пытается понизить защиту противника";
    }
}

