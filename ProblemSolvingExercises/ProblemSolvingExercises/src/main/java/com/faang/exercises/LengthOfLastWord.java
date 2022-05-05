package com.faang.exercises;

public class LengthOfLastWord {
    public static void main(String args[]){
        System.out.println(calculateLength("This is the World"));
    }
    static int calculateLength(String input) {
        String[] array= input.split(" ");
        return array[array.length-1].length();

    }
}
