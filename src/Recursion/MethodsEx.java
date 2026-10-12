package Recursion;

public class MethodsEx {
    static void main() {
        int result = add(10, 20);
        System.out.println(result);
        mul(10,20);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
}
