package org.example;

import java.util.Stack;

public class Balanced_Expresstion {
    public boolean Balanced_check(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            if (ch == ')')
                stack.pop();
        }
        return stack.empty();
    }

}
