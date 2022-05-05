package com.problems.exercises.random;

import java.util.*;
import java.util.stream.Collectors;

public class ApacheLogFile {
    /**
     * Given a log file, return IP address(es) which accesses the site most often.
     */

    public static String findTopIpaddress(String[] lines) {
        String result="";
        List<String> ipAddress=new ArrayList<>();
        Arrays.stream(lines).forEach(item->{
           ipAddress.add(item.split("-")[0].trim());

        });
        Map<String,Integer> resultMap = new HashMap<>();
        Integer maxValue = 1;
       for(String s:ipAddress){
           if(!resultMap.containsKey(s)){
               resultMap.put(s,1);
           }
           else{
               Integer val=resultMap.get(s);
               resultMap.put(s,val+1);
           }
       }
   Integer topCount= resultMap.values().stream().mapToInt(v->v).max().getAsInt();
       result= resultMap.entrySet().stream().filter(x->x.getValue()==topCount).map(k->k.getKey()).findFirst().get();



       return result;
    }




    public static void main(String[] args) {

        String lines[] = new String[] {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132" };
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }

}
