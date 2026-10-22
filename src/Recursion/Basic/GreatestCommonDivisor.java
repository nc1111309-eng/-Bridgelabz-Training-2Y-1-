package Recursion.Basic;
import java.util.*;
public class GreatestCommonDivisor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int x = sc.nextInt();
        System.out.print("Enter num:");
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
    public static int gcd(int x,int y){
        if(y==0) return x;
         return gcd(y,x%y);

    }
}
