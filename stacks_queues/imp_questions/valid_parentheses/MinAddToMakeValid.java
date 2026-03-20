package stacks_queues.imp_questions.valid_parentheses;

import java.util.Stack;

public class MinAddToMakeValid {

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int minToAdd = 0;

        for(char ch: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                char top = stack.peek();
                if(top == '(' && ch == ')'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }

        while(!stack.isEmpty()){
            stack.pop();
            minToAdd++;
        }

        return minToAdd;
    }

    public static void main(String[] args){
        String s = "())";

        System.out.println(minAddToMakeValid(s));
    }
}
