package org.lubna.fundamentals.week6.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionChallengeTwo {
    public static void main(String[] args) {
        Map<String, String> contactMap = new HashMap<>();
        contactMap.put("Simon", "simon.elbrink@lexicon.se");
        contactMap.put("Harry", "harry.emil@lexicon.se");

        Set<String> info = new HashSet<>(contactMap.keySet());
        info.contains(contactMap.get("Simon"));
        info.contains(contactMap.get("Harry"));

            System.out.println(info);
        }
    }
