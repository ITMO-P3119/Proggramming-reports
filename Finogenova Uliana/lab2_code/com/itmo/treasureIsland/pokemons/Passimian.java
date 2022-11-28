package com.itmo.treasureIsland.pokemons;

import com.itmo.treasureIsland.attacks.QuickAttack;
import com.itmo.treasureIsland.attacks.RockSmash;
import com.itmo.treasureIsland.attacks.VitalThrow;
import com.itmo.treasureIsland.attacks.RockTomb;
import ru.ifmo.se.pokemon.*;

public class Passimian extends Pokemon {
    public Passimian(String name, int level) {
        super(name, level);
        this.setType(Type.FIGHTING);
        this.setStats(100, 120, 90, 40, 60, 80);
        this.addMove(new QuickAttack());
        this.addMove(new RockSmash());
        this.addMove(new VitalThrow());
        this.addMove(new RockTomb());
    }
}