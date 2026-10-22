package Recursion.Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr,index,target));
    }
    public static int search(int arr[],int index,int target){
        if (index== arr.length-1) return -1;
        if(arr[index]==target) return index;
         return search(arr,index+1,target);
    }
}
