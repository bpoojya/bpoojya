package com.faang.exercises;

import java.util.Stack;

public class PostFixExpression {
    public static void main(String args[]) {
        System.out.println(evaluatePostFix(new String[]{"4", "13", "5", "/", "+"}));
    }

    static Integer evaluatePostFix(String[] input) {
//using stack
        Stack<Integer> inputStack = new Stack<>();
        for (String s : input) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                Integer firstValue = null;
                Integer secondValue = null;
                if (inputStack.size() != 0) firstValue = inputStack.pop();
                if (inputStack.size() != 0) secondValue = inputStack.pop();
                if (secondValue == null || firstValue == null) {
                    System.out.println("Invalid String input");
                } else {
                    if (s.equals("+")) {
                        inputStack.push(secondValue + firstValue);
                    }
                    if (s.equals("-")) {
                        inputStack.push(secondValue - firstValue);
                    }
                    if (s.equals("/")) {
                        inputStack.push(secondValue / firstValue);
                    }
                    if (s.equals("*")) {
                        inputStack.push(secondValue * firstValue);
                    }


                }
            } else {
                inputStack.push(Integer.parseInt(s));
            }
        }

        return inputStack.peek();
    }
}
     /*   for (int i = 0; i < input.length; i++) {
            String s = input[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                Integer value1 = null;
                Integer value2 = null;
                Integer currentResult = null;
                if (i - 1 >= 0) value1 = Integer.parseInt(input[i - 1]);
                if (i - 2 >= 0) value2 = Integer.parseInt(input[i - 2]);
                if (value2 == null || value1 == null) {
                    System.out.println("Invalid String input");
                } else {
                    if (s.equals("+")) {
                        currentResult = value2 + value1;
                    }
                    if (s.equals("-")) {
                        currentResult = value2 - value1;
                    }
                    if (s.equals("/")) {
                        currentResult = value2/ value1;
                    }
                    if (s.equals("*")) {
                        currentResult = value2 * value1;
                    }
                    input[i - 2] = String.valueOf(currentResult);
                    input[i-1]=input[i+1];


                }

            }


        }

        return Integer.parseInt(input[0]);

    }*/

