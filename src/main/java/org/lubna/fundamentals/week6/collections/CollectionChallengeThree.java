package org.lubna.fundamentals.week6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionChallengeThree {
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero(1,"Hulk",20));
        superHeroes.add(new SuperHero(2,"Marvel",25));
        superHeroes.add(new SuperHero(3,"Avengers",18));

        Collections.sort(superHeroes);
        System.out.println(superHeroes);
    }
}