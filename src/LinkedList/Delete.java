package LinkedList;
 class Delete{

public static class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
             this.data = data;
         }
         public static Node head;
         public static Node tail;

         public static void insertfirst(int data){
             Node newNode = new Node(data);
             if (head==null) head = tail = newNode; return;


         }
         public static void display(){
             Node temp = head;
             while (temp!=null){
                 System.out.println(temp.data+"<->");
                 temp = temp.next;
             }
             System.out.println("null");
         }
         public static void deletefirst(){
              Node temp = head;
              if(head==null) return;
              if (head==tail) head = tail = null;
              head = head.next;
              head.prev = null;
              }
         }

     static void main() {

     }

     }
