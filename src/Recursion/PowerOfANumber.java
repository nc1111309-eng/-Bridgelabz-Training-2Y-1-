package Recursion;

public class PowerOfANumber {
    static void main() {
        System.out.println(pow(2,6));
    }public  static int pow( int p,int q){
        if (q==0){
            return 1;
        }
        int small  = pow(p,q-1);
        return p*small;

    }
}
