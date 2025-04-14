package com.dsa450.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stocks {
    public static void main(String[] args) {
        generateParenthesis(3);

    }

    public static List<String> generateParenthesis(int n) {
        return generateParenthesis(n, 0, 0, new StringBuilder(), new ArrayList<>());

    }

    public static List<String> generateParenthesis(int n, int open, int closed, StringBuilder output, List<String> result) {

        if (output.length() >= n * 2) {
            result.add(output.toString());

        }


        if (open < n) {
            output.append("(");
            generateParenthesis(n, open + 1, closed, output, result);
            output.deleteCharAt(output.length() - 1);

        }
        if (closed < open) {
            output.append(")");
            generateParenthesis(n, open, closed + 1, output, result);
            output.deleteCharAt(output.length() - 1);

        }

        return result;
    }
}