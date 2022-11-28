package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends PhysicalMove {

    public Thunderbolt () {
        super (Type.ELECTRIC, 15, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.PARALYZE).chance(0.1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "пытается парализовать противника";
    }
}