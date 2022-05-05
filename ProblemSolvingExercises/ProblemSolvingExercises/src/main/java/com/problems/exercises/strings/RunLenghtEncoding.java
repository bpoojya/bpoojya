package com.problems.exercises.strings;

import java.util.HashMap;
import java.util.Map;

public class RunLenghtEncoding {
    public static String rle(String input) {
        String output = "";
        Map<Character, Integer> resultMap = new HashMap<>();
        char[] c1 = input.toCharArray();
        for (char c : c1) {
            if (!resultMap.containsKey(c)) {
                resultMap.put(c, 1);

            } else {
                int val = resultMap.get(c) + 1;
                resultMap.put(c, val);
            }

        }
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            output = output + entry.getKey().toString() + entry.getValue().toString();

        }
        return output;
    }

    public static void main(String[] args) {

        if ("".equals(rle("")) &&
                "a1".equals(rle("a")) &&
                "a3".equals(rle("aaa")) &&
        rle("aabbbccc").equals("a2b3c3")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

