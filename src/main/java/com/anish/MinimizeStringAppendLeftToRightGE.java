package com.anish;

import java.util.Stack;
//@Anish GE HankerRank Code
public class MinimizeStringAppendLeftToRightGE {

    public static void getCount(String left, String right) {
        Stack<Character> stack = new Stack<Character>();
            if (left.charAt(0) == right.charAt(right.length() - 1)) {
                stack.push(right.charAt(right.length() - 1));
                char ch = stack.pop();
                minimizeString(left, right, ch);
            }else{
                System.out.println((left + right).length());
            }
    }

    public static void minimizeString(String left, String right, char ch) {
        for (int i = 0; i < right.length(); i++) {
            if (ch == left.charAt(0)) {
                left = left.substring(1, left.length());
            }
            if (ch == right.charAt(right.length() - 1)) {
                right = right.substring(0, right.length() - 1);
            }
        }
        getCount(left,right);
    }

    public static void main(String args[]) throws Exception {
        String str = "aabccccabbav";
        int n = str.length() - 1;
        String left = str.substring(0, n / 2);
        String right = str.substring(n / 2, n + 1);
        getCount(left,right);
    }
}
