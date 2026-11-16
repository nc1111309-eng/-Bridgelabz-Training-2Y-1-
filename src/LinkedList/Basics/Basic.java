package LinkedList.Basics;

public class Basic {

     class Node{
          int data;
          Node next;

          public  Node(int data){
              this.data = data;
          }
     }
    public static Node head;
      public static Node tail;

      public static void display(int value){

          Node temp = head;
          while(temp!=null){
              System.out.println(temp.data+"->");
              temp=temp.next;
          }
      }
}
