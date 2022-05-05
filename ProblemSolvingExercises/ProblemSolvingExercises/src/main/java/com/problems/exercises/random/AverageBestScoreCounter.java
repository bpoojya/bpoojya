package com.problems.exercises.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageBestScoreCounter {

    /*
     **  Find the best average grade.
     */
    public static Integer bestAverageGrade(String[][] scores)
    {

        int returnValue=0;

        Map<String, List<Integer>> scoreMap= new HashMap<>();
        for(int i=0;i<scores.length;i++){

            String name=  scores[i][0];
            String scoreValue= scores[i][1];
            if(!scoreMap.containsKey(name)){
                scoreMap.put(name, Arrays.asList(Integer.parseInt(scoreValue),1));
            }
            else{
                Integer sumScore=   scoreMap.get(name).get(0).intValue()+Integer.parseInt(scoreValue);
                int counter= scoreMap.get(name).get(1)+1;
                scoreMap.put(name,Arrays.asList(sumScore,counter));
            }




        }

        for(List<Integer> avgScores: scoreMap.values()){


            int average=avgScores.get(0).intValue()/avgScores.get(1).intValue();
            returnValue= Math.max(returnValue,average);

        }
        return returnValue;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass()
    {
        // TODO: implement more test cases
        String[][] tc1 = { { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" } };

        return bestAverageGrade(tc1) == 87;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args)
    {
        // Run the tests
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }
}
