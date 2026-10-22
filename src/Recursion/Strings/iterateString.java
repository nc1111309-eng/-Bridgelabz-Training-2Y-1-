package Recursion.Strings;

public class iterateString {

        static void main() {
            String name = "Nitin";
            int index = 0;
            print(name,index);
        }
        public static void print( String name,int index){
            if(index==name.length()){
                return;
            }

            System.out.println(name.charAt(index));
            print(name,index+1);
        }

    }
