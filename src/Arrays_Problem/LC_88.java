package Arrays_Problem;

import java.util.Arrays;

public class LC_88 {
    public static int[] merge(int num1[],int num2[]){
        int m = num2.length;

        for (int i = 0; i < m; i++) {
            num1[m + i] = num2[i];

        }
         Arrays.sort(num1);
        return num1;
    }

    static void main() {
        int num1[] ={1,2,3,0,0,0};
        int num2[] = {2,5,6};
        int [] arr = merge(num1,num2);
        System.out.println(Arrays.toString(arr));
    }
}
