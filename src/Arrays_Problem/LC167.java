//package Arrays_Problem;
//public class LC167 {
//    public static int[] twoSum(int[] num,int target){
//        int start = 0;
//        int end = num.length-1;
//
//        while (start<end){
//            if(num[start]+num[end]==target){
//                return new int[]{start+1,end+1};
//            } else if (num[start]+num[end]<target) {
//                start++;
//            }else{
//                end--;
//            }
//        }
//        return new int[]{-1,-1};
//
//    }
//
//    static void main() {
//        int num[] = {2,7,11,15};
//        int target = 9;
//        int arr[] = twoSum(num,target);
//        System.out.println(Arrays.toString(arr));
//    }
//}
