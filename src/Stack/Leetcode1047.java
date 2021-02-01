package Stack;

import java.util.Stack;

// 1047. Remove All Adjacent Duplicates In String
public class Leetcode1047 {

    public String removeDuplicates(String S) {

        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == c)
                stack.pop();

            else
                stack.push(c);

        }

        StringBuilder sb = new StringBuilder();
        for(char s : stack) sb.append(s);
        return sb.toString();

    }
}
