package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){
        super(Type.PSYCHIC, 40, 100);
    }

    @Override
    public String describe() {
        return "использует быструю атаку";
    }
}