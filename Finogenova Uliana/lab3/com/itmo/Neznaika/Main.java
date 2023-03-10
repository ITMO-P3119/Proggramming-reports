package com.itmo.Neznaika;
import com.itmo.Neznaika.*;

public class Main {
    public static void main(String[] args) {

        Human nezn = new Human("Незнайка");
        Talkative kozl = new Talkative("Козлик"); // think + ask + question + say
        Talkative prod = new Talkative("Продавщица");
        prod.setSecondName("Продавщиц");
        Human hoz = new Human("хозяин");
        Human them = new Human("Они");

        Place pereul = new Place("Змеиный переулок");
        Place there = new Place("здесь");
        Place magaz = new Place("разнокалиберный магазин");
        Place condit = new Place("кондитерская");


        String output = them.search(pereul.exposition(desc.AROUND)) + desc.AFTER.getContent() + them.walk() + desc.THIRDTIME.getContent() + ".\n" +

                desc.FIN.getContent() + kozl.stop(condit.preexposition(desc.NEAR)) + kozl.think("здесь раньше не было") + ".\n" +

                nezn.getName() + " и " + kozl.getIn(condit.preexposition(desc.IN)) + ".\n" +

                nezn.getName() + " и " + kozl.ask(prod.preexposition(desc.ONEOF)) + kozl.question(magaz.getName()) + ".\n" +

                prod.say(magaz.close()) + ".\n" +

                desc.SUDDENLY.getContent() + hoz.rich() + "и" + hoz.travel() + ".\n" +

                desc.NOW.getContent() + there.isOpen(condit.getName()) + ".";

        System.out.println(output);

    }
}