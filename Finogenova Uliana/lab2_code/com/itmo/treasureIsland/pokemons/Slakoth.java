package com.itmo.treasureIsland.pokemons;

import com.itmo.treasureIsland.attacks.FireBlast;
import com.itmo.treasureIsland.attacks.Thunderbolt;
import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(60, 60, 60, 35, 35, 30);
        this.addMove(new FireBlast());
        this.addMove(new Thunderbolt());
    }
}