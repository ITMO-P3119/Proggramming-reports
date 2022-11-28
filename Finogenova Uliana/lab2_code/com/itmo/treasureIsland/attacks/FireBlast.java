package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends PhysicalMove {

    public FireBlast () {
        super (Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.BURN).chance(0.1);  // 10% вероятность
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "пытается поджечь противника";
    }
}

