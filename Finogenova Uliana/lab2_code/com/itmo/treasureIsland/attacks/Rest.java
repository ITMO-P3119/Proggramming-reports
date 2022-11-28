package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.addEffect(new Effect().condition(Status.SLEEP).turns(2)); // спит след. два хода
        pok.restore(); // восстанавливает исходное сост. покемона
        super.applySelfEffects(pok);
    }

    @Override
    public String describe() {
        return "засыпает, чтобы излечиться";
    }
}