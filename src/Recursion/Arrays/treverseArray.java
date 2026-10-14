package Recursion.Arrays;

public class treverseArray {
    static void main() {
    int arr[] = {1,6,4,98,34,23,45};
    printInc(arr,0);
        System.out.println();
        rev(arr,arr.length-1);
    }
    public static void printInc(int[] arr,int index){
        if(index== arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        printInc(arr,index+1);
    }
    public static void rev(int[] arr,int index){
        if(index<0){
            return;
        }
        System.out.print(arr[index]+" ");
        rev(arr,index-1);
    }

}
