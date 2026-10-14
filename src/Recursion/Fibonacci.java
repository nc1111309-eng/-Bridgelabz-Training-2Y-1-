package Recursion;

public class Fibonacci {
    static void main() {
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        if (n==0||n==1){
            return n;
        }
        int small = fibo(n-1);
        int small2 = fibo(n-2);
        int result =  small+small2;
        return result ;
    }
}
