package com.faang.exercises;

public class ExcelSheetColumnNumber {
    public static void main(String args[]) {
        System.out.println(evaluateExpression("AAA"));
    }

    static Long evaluateExpression(String input) {
       Long output=0L;
        for(int i=input.length()-1;i>=0;i--){
            int value= input.charAt(i)-'A'+1;
            int powerValue= input.length()-i-1;
            Double pow=value*Math.pow(26,powerValue);
          output=output+pow.longValue();
        }
        return output;
    }
}
