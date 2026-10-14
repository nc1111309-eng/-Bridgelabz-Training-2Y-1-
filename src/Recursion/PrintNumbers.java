package Recursion;

public class PrintNumbers {
    static void main() {
        print(10);
    }
    public static  void print(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //Recursive case
        print(n-1);
        System.out.println(n);
    }
}
