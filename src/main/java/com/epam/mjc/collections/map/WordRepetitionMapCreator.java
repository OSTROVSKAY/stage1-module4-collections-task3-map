package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> map = new HashMap<>();

        if(!sentence.isEmpty()) {

            String[] sentence1 = sentence.split(" ");

            for (int i = 0; i < sentence1.length; i++) {

                String a = sentence1[i];

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < a.length(); j++) {

                    char aa = a.charAt(j);

                    if (Character.isLetter(aa)) {

                        sb.append(aa);

                    }

                }

                String a1 = sb.toString();

                a1 = a1.toLowerCase();

                sentence1[i] = a1;

            }

            Arrays.sort(sentence1);

            int count = 0;


            for (int i = 0; i < sentence1.length; i++) {

                count = 0;

                String a = sentence1[i];

                for (int j = 0; j < sentence1.length; j++) {

                    if (a.equals(sentence1[j])) {

                        count++;

                    }

                }

                map.put(sentence1[i], count);

            }

        }

        return map;

    }
}
