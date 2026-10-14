package Recursion;

public class SumOfDigits {
    static void main() {
        System.out.println(sum(12345));
    }
    public static int sum(int n){
        if(n<10){
            return n;
        }
        int small=  n%10;
       int small1 = sum(n/10);
        return small+small1;

    }
}
