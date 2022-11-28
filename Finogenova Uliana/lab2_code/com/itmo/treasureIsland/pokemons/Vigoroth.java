package com.itmo.treasureIsland.pokemons;

import com.itmo.treasureIsland.attacks.FurySwipes;

public class Vigoroth extends Slakoth {
    public Vigoroth(String name, int level) {
        super(name, level);
        this.setStats(80, 80, 80, 55, 55, 90);
        this.addMove(new FurySwipes());
    }
}