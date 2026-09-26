package SlidingWindow;

public class LC209 {
    static void main() {
        int [] nums = {2,3,1,2,4,3};
        int target=7;


        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        target = 7;
         nums = new int[]{2, 3, 1, 2, 4, 3};
         int minlength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            while (sum >= target) {
                minlength = Math.min(minlength, end - start + 1);
                sum = sum - nums[start];
                start++;
            }
        }
        if (minlength == Integer.MAX_VALUE) {
            return 0;
        }
        return minlength;
    }

}

