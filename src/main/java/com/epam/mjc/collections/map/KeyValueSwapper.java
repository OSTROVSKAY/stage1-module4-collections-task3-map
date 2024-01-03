package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> map = new HashMap<>();

        for(Map.Entry<Integer, String> entry : sourceMap.entrySet()) {

            Integer key = entry.getKey();

            String value = entry.getValue();

            map.put(value, key);

        }


        for(Map.Entry<String, Integer> entry : map.entrySet()) {

            String key = entry.getKey();

            Integer value = entry.getValue();

            for(Map.Entry<Integer, String> entry1 : sourceMap.entrySet()) {

                Integer key1 = entry1.getKey();

                String value1 = entry1.getValue();

                if(key.equals(value1)) {

                    if(key1 < value) {

                        value = key1;

                    }

                }

            }

            map.put(key,value);

        }

        return map;

    }
}
