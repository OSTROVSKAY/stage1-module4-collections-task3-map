package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {

        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        int check = 0;

        for(Map.Entry<Integer, Integer> entry : functionMap.entrySet()) {

            Integer value = entry.getValue();

            if(requiredValue == value) {

                check = 1;

            }

        }

        boolean a = check == 1;

        return a;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < sourceList.size(); i++) {

            int x = sourceList.get(i);

            int result = 5 * x + 2;

            map.put(x,result);

        }

        return map;

    }
}
