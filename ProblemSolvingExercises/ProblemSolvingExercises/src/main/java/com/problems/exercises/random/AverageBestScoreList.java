package com.problems.exercises.random;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AverageBestScoreList {


    public static Integer bestAverageGrade(String[][] scores) {
        int returnValue = 0;
        Map<String, List<Integer>> scoreMap = new HashMap<>();
        for (int i = 0; i < scores.length; i++) {

            String name = scores[i][0];
            String scoreValue = scores[i][1];
            List<Integer> mainList= new ArrayList<>();
            if (!scoreMap.containsKey(name)) {
                mainList.add(Integer.parseInt(scoreValue));
                scoreMap.put(name,mainList);
            } else {
               List<Integer> subList=scoreMap.get(name);
               subList.add(Integer.valueOf(scoreValue));
               scoreMap.put(name,subList);

            }



        }

        for (List<Integer> avgScores : scoreMap.values()) {
            int avg = 0;
            for (Integer i : avgScores) {
                avg = avg + i;

            }
            int average = avg / avgScores.size();


            returnValue = Math.max(returnValue, average);

        }
        return returnValue;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass() {
        // TODO: implement more test cases
        String[][] tc1 = {{"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}};

        return bestAverageGrade(tc1) == 87;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args) {
        // Run the tests
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }
}

