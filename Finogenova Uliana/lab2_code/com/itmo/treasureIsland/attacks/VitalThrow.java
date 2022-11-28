package com.itmo.treasureIsland.attacks;

import ru.ifmo.se.pokemon.*;

public class VitalThrow extends PhysicalMove {
    public VitalThrow(){
        super(Type.FIGHTING, 70, 100, -1, 1);
    }

    @Override
    public String describe() {
        return "добрался до атаки с пониженным приоритетом";
    }
}