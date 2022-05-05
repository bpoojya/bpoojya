package com.faang.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllSubsequencesOfString {
    public static void main(String args[]) {
       findAllSubsequences("abcd","", new ArrayList<String>()).stream().forEach(s->System.out.println(s));
      //  Arrays.stream(findAllSubsequences2("abcd","", new String[16],0)).forEach((s -> System.out.println(s)));
    }

    static List<String> findAllSubsequences(String input, String output, List<String> list){
        //base case

        if(input.length()==0){
           list.add(output);
            return list;
        }

        //exclude first character
        findAllSubsequences(input.substring(1,input.length()),output, list);

        //include first character
        findAllSubsequences(input.substring(1,input.length()), output+input.charAt(0),list);

        return list;
    }

    // Store in array

  /*  static String[] findAllSubsequences2(String input, String output, String[] list,int index){
        //base case

        if(input.length()==0){
            list[index]=output;
            return list;
        }

        //exclude first character
      findAllSubsequences2(input.substring(1,input.length()),output, list,++index);

        //include first character
       findAllSubsequences2(input.substring(1,input.length()), output+input.charAt(0),list,++index);

        return list;
    }
*/
}
