package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.PSYCHIC, 18, 80, 0, (int)(Math.ceil(Math.random()*(2-5)+2)));
    }

    @Override
    public String describe() {
        return "применяет Fury Swipes";
    }
}