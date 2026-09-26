package problems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibonacci(int n) {
        if(n<0)return;
        System.out.print("0 ");
        if(n==0)return;
        System.out.print("1 ");
        int first = 0;
        int second = 1;
         while (first+second<=n){
             int next = first + second;
             System.out.print(next+ " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
}