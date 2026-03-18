package stacks_queues.imp_questions.largest_rectangle_histogram;

import java.util.Stack;

public class Main {

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        stack.push(0);

        for(int i=1; i<heights.length; i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()] ){
                maxArea = getMax(heights, stack, maxArea, i);
            }
            
            stack.push(i);
        }

        int i = heights.length;

        while(!stack.isEmpty()){
            maxArea = getMax(heights, stack, maxArea, i);
        }

        return maxArea;
    }

    public static int getMax(int[] arr, Stack<Integer> stack, int maxArea, int i){

        int area;

        int popped = stack.pop();

        if(stack.isEmpty()){
            area = arr[popped] * i;
        }else{
            area = arr[popped]* (i-1-stack.peek());
        }

        return Math.max(maxArea, area);
    }

    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(heights));
    }
}
