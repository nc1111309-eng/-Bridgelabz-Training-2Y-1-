package LinkedList.Basics;
class Search {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;

    // 1. Display Linked List
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        //System.out.println("null");
    }
    // 2. Insert at End
    public static void insertAtEnd(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // 3. Insert at Start
    public static void insertAtStart(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // 4. Count Nodes
    public static int countNodes() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    // 5. Search Element
    public static int search(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    // 6. Nth Node from End
    public static Node nthNodeFromEnd(int n) {


        if (n <= 0) {
            return null;
        }
        Node first = head;
        Node second = head;

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {

            if (first == null) {
                return null;
            }
            first = first.next;
        }
        // Move both pointers together
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
    public static Node findmid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow  = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Main Method
    public static void main(String[] args) {

        insertAtEnd(4);
        insertAtEnd(5);
        insertAtEnd(6);

       // insertAtStart(5);
        insertAtStart(3);
        insertAtStart(2);
        insertAtStart(1);

        System.out.println("Linked List:");
        display();
        System.out.println();
        Node mid = findmid();
        System.out.println("mid "+mid.data);
        System.out.println("Number of Nodes: " + countNodes());

        System.out.println("Index of Element 5: " + search(5));

        Node result = nthNodeFromEnd(2);

        if (result != null) {
            System.out.println("2nd Node from End: " + result.data);
        } else {
            System.out.println("Invalid Position");
        }
    }
}