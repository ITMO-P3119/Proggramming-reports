package com.itmo.treasureIsland.pokemons;

import com.itmo.treasureIsland.attacks.Rest;
import com.itmo.treasureIsland.attacks.DoubleTeam;
import com.itmo.treasureIsland.attacks.TailWhip;
import ru.ifmo.se.pokemon.*;

public class Blitzle extends Pokemon {
    public Blitzle(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(45, 60, 32, 50, 32, 76); // attack, defence, hp, special attack, special defence, speed
        this.addMove(new Rest());
        this.addMove(new DoubleTeam());
        this.addMove(new TailWhip());
    }
}