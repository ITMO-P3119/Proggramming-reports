package com.itmo.Neznaika;

public class Talkative extends Human implements Icanask, Icansay{

    public Talkative(String name) {
        super(name);
    }

    public String think(String what) {
        return ", которой, как ему показалось, " +  what;
    }

    public String ask(String who) {
        return this.getName() + " спросили " + who;
    }

    public String question(String what) {
        return ", не знает ли она, куда делся " +  what;
    }

    public String say(String what) {
        return this.getName() + " сказала, что " + what;
    }

}