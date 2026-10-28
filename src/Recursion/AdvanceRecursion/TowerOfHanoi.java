package Recursion.AdvanceRecursion;

public class TowerOfHanoi {
    static void main() {
        int n =3;
         tho(n,'A','B','C');
    }
    public static void tho(int n,char source,char helper,char destination ){
        if(n==1) {
            System.out.println("Move Disk" + 1 + "from" + source + "to" + destination);
            return;
        }
        tho(n-1,source,destination,helper);
        System.out.println("Move Disk"+n+"from"+source+"to"+destination);
        tho(n-1,helper,source,destination);
    }
}
