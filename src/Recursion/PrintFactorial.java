package Recursion;

public class PrintFactorial {
    static void main() {
        System.out.println(fact(5));
        System.out.println(sum(10));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // recursive work
        int small= fact(n-1);
        return n*small;
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int small = sum(n-1);
        return small+n;
    }
}
