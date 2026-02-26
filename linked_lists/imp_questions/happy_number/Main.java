package linked_lists.imp_questions.happy_number;

public class Main {

    public static boolean isHappy(int n){
        int fast = n, slow = n;
        do{
            slow = findSumOfDigitSquare(slow);
            fast = findSumOfDigitSquare(findSumOfDigitSquare(fast));
            
            if(slow == 1 || fast == 1){
                return true;
            }

        }while(fast!=slow);

        return false;
    }

    public static int findSumOfDigitSquare(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=(digit*digit);
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args){

        int n = 19;

        System.out.println(isHappy(n));
    }
}
