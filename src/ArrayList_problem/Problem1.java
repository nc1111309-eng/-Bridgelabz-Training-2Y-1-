package ArrayList_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0,1);
        list.add(1,8);
        list.add(2,6);
        list.add(3,3);
        list.add(4,9);
        System.out.println("This is Array list: \n"+ list);
        int result[] = new int[5];
        for (int i=0;i<result.length;i++){
            result[i] =list.get(i);
        }
        System.out.println("convert into Array");
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }
}
