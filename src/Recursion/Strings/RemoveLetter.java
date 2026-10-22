package Recursion.Strings;

public class RemoveLetter {
    static void main() {
        String name = "abcabc";
        int index = 0;
        System.out.println(remove(name,index));
    }
    public static String remove(String name,int index){
        if (index==name.length()){
            return " ";
        }
        String small = remove(name,index+1);
        char ch = name.charAt(index);
        if (ch!='a') return ch+small;
        else  return small;

    }
}
