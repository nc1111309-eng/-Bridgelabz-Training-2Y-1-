package Recursion.Arrays;

public class MaximumElement {
    static void main() {
int index = 0;
    int [] arr = {5,7,99,1,0,4};
        System.out.println(max(arr,index));
    }
    public static int max(int [] arr,int index){
        if(index== arr.length-1) return arr[index];
        int small = max(arr,index+1);
        return Math.max(small,arr[index]);
    }
}
