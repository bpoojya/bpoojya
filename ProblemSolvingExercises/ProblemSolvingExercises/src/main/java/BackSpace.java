import com.problems.exercises.random.LinkedList;
import com.problems.exercises.random.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BackSpace {

    public static void main(String args[]) {
        System.out.println(backspaceCompare("ab#c",
                "ad#c"
        ));
    }

    public static boolean backspaceCompare(String s, String t) {
        Deque<Character> c = new ArrayDeque<>();

        String output1 = "";
        String output2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                c.addLast(s.charAt(i));
            } else {
                if (c.size() != 0) {
                    c.removeLast();
                }
            }
        }
        int length=c.size();
        for (int i = 0; i < length; i++) {
            output1 += c.removeFirst();
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                c.addLast(t.charAt(i));
            } else {
                if (c.size() != 0) {
                    c.removeLast();
                }
            }
        }
        int length2=c.size();
        for (int i = 0; i < length2; i++) {
            output2 += c.removeFirst();
        }
        return output1.equals(output2) ? true : false;
    }
}