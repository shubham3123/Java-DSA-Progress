public class CustomSinglyLinkedList {
    
    private Node head; // entry point

// Define the structure of node block
private static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
/* -----------------X-X-X----------------- */

// insert end node
public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null)
{
    head = newNode;
    return;

}
Node current = head;
while (current.next != null) {
    current = current.next;
}

current.next = newNode;

}



/* -----------------MAIN CODE----------------- */

public static void main(String[] args) {
    CustomSinglyLinkedList list = new CustomSinglyLinkedList();
    list.insert(123);
    list.insert(456);
    list.insert(789);

    // Print the linked list
    Node current = list.head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");


}




}
