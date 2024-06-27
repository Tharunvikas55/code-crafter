//package Parentheses;
// 32. Longest Valid Parentheses
// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
// substring
// .

// Example 1:

// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".
// Example 2:

// Input: s = ")()())"
// Output: 4
// Explanation: The longest valid parentheses substring is "()()".
// Example 3:

// Input: s = ""
// Output: 0

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2)
            return 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            else {
                if (!st.empty() && s.charAt(st.peek()) == '(')
                    st.pop();
                else
                    st.push(i);
            }
        }
        int len = 0;
        int end = s.length();
        while (!st.empty()) {
            int start = st.pop();
            len = Math.max(len, (end - start) - 1);
            end = start;
        }
        return Math.max(end, len);
    }
}
