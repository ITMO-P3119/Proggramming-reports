package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(){
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPECIAL_ATTACK, -2); //снижает СВОЮ спец.атаку
        super.applySelfEffects(pok);
    }

    @Override
    protected String describe() {
        return "понижает свою специальную аттаку";
    }
}