class Node {
    int data;       // Value stored in the node
    Node next;      // Reference to the next node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class linkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class link {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}}

