public class doublyLL {
    
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    // Ques 1 add kro aage side ke new node ( add a new node at head (starting))
    static Node insertAtHead(Node head, int n){
        Node t = new Node(n);
        t.next = head;
        head.prev = t;
        return t;
    }

    // Ques 2 add a new node at tail (end)
    static void insertAtTail(Node head, int n){
        Node temp = head;
        // temp ko ham sabse pehle tail tak le jaengey
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(n);
        temp.next = t;
        t.prev = temp;

    }

    // Ques 3 add a new node at any index
    public static void insertAtIndex(Node head, int idx, int n){
        Node s = head;
        for(int i = 1; i <= idx; i++){
            s = s.next;
        }
        // s is at idx -  1 position
        Node r = s.next;
        Node t = new Node(n);
        s.next = t;
        t.next = r;
        r.prev = t;
    }

    //Ques 4 Reverse Doubly Linked list

    public static void displayRev(Node tail) {
        Node temp = tail;
    
        // Start by printing NULL (end of list)
        System.out.print("NULL");
    
        // Traverse in reverse order using the prev pointer
        while (temp != null) {
            System.out.print(" <==> " + temp.data);
            temp = temp.prev;
        }
    
        // End by printing NULL again
        System.out.print(" <==> NULL");
        System.out.println();  // Move to the next line after printing
    }
    
    
    
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> " );
            temp = temp.next;

        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int data;
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // System.out.println(a);
        // System.out.println(a.data);

        a.prev = null;
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;
        e.next = null;
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(a.next);

        display(a);
        Node newHead = insertAtHead(a, 193);
        display(newHead);
        insertAtTail(a, 500);
        display(newHead);
        // ctrl + alt + n => shortcut to run code
        insertAtIndex(a,2,80);
        display(newHead);
        displayRev(e);
    }
}