package leets;

import java.util.Scanner;
import java.util.Stack;

public class paretheses {
    static boolean isValid(char[] c) {
        Stack<Character> stack = new Stack<>();

        boolean ans = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                stack.push(c[i]);

            } else if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                if (stack.isEmpty()) {// not empty
                    return false;
                }
                char top = stack.peek();
                if (c[i] == ')' && top == '(' ||
                        c[i] == ']' && top == '[' ||
                        c[i] == '}' && top == '{') {
                    stack.pop();
                    ans = true;
                } else {
                    ans = false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String s = o.nextLine();
        char[] ch = s.toCharArray();
        System.out.println(isValid(ch));
        o.close();
    }

}
