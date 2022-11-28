package lab2_code.com.itmo.treasureIsland;
import lab2_code.com.itmo.treasureIsland.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle epicFight = new Battle();

        Pokemon p1 = new Passimian("Доктор Ливси", 8); // level 8 is needed for Rock Smash attack
        Pokemon p2 = new Blitzle("Джимми Гокинс", 4); // for Tail Whip attack
        Pokemon p3 = new Zebstrika("Капитан Смоллет", 1);

        Pokemon p4 = new Slakoth("Билли Бонс", 1);
        Pokemon p5 = new Vigoroth("Слепой Пью", 14); // for Fury Swipes attack
        Pokemon p6 = new Slaking("Джон Сильвер", 1);

        epicFight.addAlly(p1);
        epicFight.addAlly(p2);
        epicFight.addAlly(p3);
        epicFight.addFoe(p4);
        epicFight.addFoe(p5);
        epicFight.addFoe(p6);

        epicFight.go();
    }
}

// information from https://veekun.com/dex/