package com.itmo.treasureIsland.pokemons;

import com.itmo.treasureIsland.attacks.Overheat;

public class Zebstrika extends Blitzle {
    public Zebstrika(String name, int level) {
        super(name, level);
        this.setStats(75, 100, 63, 80, 63, 116);
        this.addMove(new Overheat());
    }
}