package com.baiching.array;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char ch: chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;
                char out = stack.pop();
                if ((out == '(' && ch != ')') || (out == '{' && ch != '}') || (out == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
