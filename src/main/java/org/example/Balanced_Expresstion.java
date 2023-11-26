package org.example;

import java.util.Stack;



public class Balanced_Expresstion {
    public boolean Balanced_check(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray()) {
            if (isLeftBrackets(ch))
                stack.push(ch);
            if (isRightBrackets(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if (bracketCheck(top,ch))
                    return false;
        }}
        return stack.empty();
    }
    private boolean isLeftBrackets(char ch){
        return ch == '('|| ch =='<' || ch =='{' || ch == '[';
    }
    private boolean isRightBrackets(char ch){
        return ch == ')' || ch =='>' || ch =='}' || ch == ']';
    }
    private boolean bracketCheck(char left , char right){
        return  (right ==')' && left != '(') ||
                (right =='>' && left != '<') ||
                (right =='}' && left != '{') ||
                (right==']' && left != '[');
    }
}
