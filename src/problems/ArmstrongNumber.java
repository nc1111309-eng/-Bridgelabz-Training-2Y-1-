package problems;

    public class ArmstrongNumber {
        public static int Count(int n){
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            return count;
        }

        public static boolean Armstrong(int n){
            int original = n;
            int sum = 0;
            int d = Count(n);
            while(n>0){
                int rem = n%10;
                sum = (int)(sum+Math.pow(rem,d));
                n=n/10;
            }
            if(sum == original){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            int n=153;
            System.out.println(Armstrong(n));
        }
    }

