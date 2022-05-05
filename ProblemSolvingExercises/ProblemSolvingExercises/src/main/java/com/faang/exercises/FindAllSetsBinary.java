package com.faang.exercises;

import java.util.ArrayList;
import java.util.List;

public class FindAllSetsBinary {
    public static void main(String args[]) {
        findAllSubsequences("abcd").stream().forEach(s -> System.out.println(s));
    }

    static List<String> findAllSubsequences(String input) {
        List<String> output = new ArrayList<>();

        for (int i = 0; i < Math.pow(2, input.length()); i++) {
            String s = "";

            for (int j = 0; j < input.length(); j++) {


                if (((1 << (j)) & i) != 0) {
                    s = s + input.charAt(j);
                }


            }
            output.add(s);
        }
        return output;

    }
}