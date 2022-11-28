package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);  //type, pp, power
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1); //скрытая стата
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "повышает уклонение на одну ступень";
    }
} 