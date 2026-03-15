package stacks_queues.imp_questions.game_of_two_stacks;

import java.util.Arrays;

public class Main {

    public static int twoStacks(int maxSum, int[] stack1, int[] stack2) {

        return helper(maxSum, stack1, stack2, 0, 0);

    }

    public static int helper(int maxSum, int[] stack1, int[] stack2, int sum, int count){
        if(sum>maxSum){
            return count - 1;
        }

        int left = count;
        int right = count;

        if(stack1.length>0){
            left = helper(maxSum, Arrays.copyOfRange(stack1, 1, stack1.length), stack2, sum+stack1[0], count+1);
        }

        if(stack2.length>0){
            right = helper(maxSum, stack1, Arrays.copyOfRange(stack2, 1, stack2.length), sum+stack2[0], count+1);
        }
        

        return Math.max(left, right);
    }

    public static void main(String[] args){
        int[] stack1 = {4, 2, 4, 6, 1};
        int[] stack2 = {2, 1, 8, 5};
        int maxSum = 10;

        System.out.println(twoStacks(maxSum, stack1, stack2));
    }
}
