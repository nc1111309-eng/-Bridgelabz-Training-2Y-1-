package LinkeLlist.Basics;

public class BasicLinkedList {
    public static Node head;
    public static Node tail;
    static void main() {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        // connect nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print(a.data + "->");
        System.out.print(b.data + "->");
        System.out.print(c.data + "->");
        System.out.print(d.data + "->");
        System.out.print(e.data + "->");
        System.out.println(e.next);

        //Second method
        System.out.print(a.data+"->");
        System.out.print(a.next.data+"->");
        System.out.print(a.next.next.data+"->");
        System.out.print(a.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.data+"->");
        System.out.println(a.next.next.next.next.next);

        System.out.println("use by for loop");
        Node temp = a;
        for(int i = 0;i<5;i++){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("use by while loop");
         Node temp1 = a;
        while(temp1!=null) {
            System.out.print(temp1.data + "->");
            temp1 = temp1.next;
        }
        System.out.println();
        System.out.println("use by method");
        display(a);
        System.out.println();
        System.out.println("use by recursion");
        recursion(a);
    }
    public static void display(Node head){
        while(head!=null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static void recursion(Node head){
        if (head==null) return;
        System.out.print(head.data+"->");
        recursion(head.next);
    }
    public static void insertEnd(int data){
        Node newNode = new Node(5);
    }
}
