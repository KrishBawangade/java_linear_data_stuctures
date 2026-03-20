package stacks_queues.imp_questions.valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }

            char top = stack.peek();

            if((top == '(' && ch == ')')
                || (top == '[' && ch == ']') 
                || (top == '{' && ch == '}')
            ){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "{[()]}";

        System.out.println(isValid(s));
    }
}
