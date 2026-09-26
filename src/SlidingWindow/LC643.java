package SlidingWindow;

public class LC643 {
    static void main() {
        int[] arr = {1,12,-5,-6,50,3};
        int sum = 0;
        int size = 4;
        int maxSum = 0;
        for(int i = 0;i<size;i++){
            sum = sum+arr[i];}
            maxSum = sum;

       // System.out.println(sum);
        for(int i = 1;i<=arr.length-size;i++){
            sum = sum-arr[i-1]+arr[i+size-1];
            maxSum = Math.max(sum,maxSum);}
            System.out.print((double)maxSum/size);

    }
}
