/**
 * @author mayuan
 * @desc
 * @date 2018/02/07
 */
public class Solution {

    public static void main(String[] args){
        test();
    }

    /**
     *
     */
    public static void test() {
        System.out.println("fib(3)= " + fibonacci(3));
        System.out.println("fib(10)= " + fibonacci(10));
    }

    public static long fibonacci(int n){
        int[] result = {0, 1};
        if (n < 2){
            return result[n];
        }

        long a = 0;
        long b = 1;
        long fibNumber = 0;
        for (int i=2; i<=n; ++i){
            fibNumber = a + b;

            a = b;
            b = fibNumber;
        }

        return fibNumber;

    }

}
