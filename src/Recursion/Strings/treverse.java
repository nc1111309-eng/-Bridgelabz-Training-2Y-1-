package Recursion.Strings;

public class treverse {
    static void main() {
        String name = "Nitin";
        int index = 0;
        print(name,index);
    }
    public static void print( String name,int index){
        if(index==name.length()){
            return;
        }
        print(name,index+1);
        System.out.println(name.charAt(index));
    }
}
