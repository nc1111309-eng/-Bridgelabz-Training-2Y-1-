package LinkeLlist.Basics;

public class Student {
    String name;

     public Student(String name){
         this.name = name;
     }

    static void main() {
        Student s1 = new Student("Nitin");
        System.out.println(s1.name);
    }
}