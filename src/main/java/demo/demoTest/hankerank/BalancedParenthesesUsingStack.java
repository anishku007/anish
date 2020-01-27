package demo.demoTest.hankerank;

import java.util.Arrays;
import java.util.Stack;

public class BalancedParenthesesUsingStack {

    public static boolean checkBalanceParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(stack.pop(), str.charAt(i))) {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            return true; /*balanced*/
        else {   /*not balanced*/
            return false;
        }
    }

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    public static void main(String[] arg) {
        String parentArr = "{}()[]";
        if (checkBalanceParentheses(parentArr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
