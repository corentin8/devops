package me.escoffier.workshop;

import fight.src.main.java.me.escoffier.workshop.hero;
import fight.src.main.java.me.escoffier.workshop.vilain;

public class Fight {

    public Hero hero;
    public Villain villain;

    public String winner;

    public Fight() {
        // USed by mapper
    }

    public Fight(Hero h, Villain v, String w) {
        hero = h;
        villain = v;
        winner = w;
    }

}
