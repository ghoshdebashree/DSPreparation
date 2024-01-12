import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCheckDuplicate {
    Node head ;
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            int currentData = current.data;

            // If the current element is already in the HashSet, skip it
            if (seen.contains(currentData)) {
                previous.next = current.next;
            } else {
                seen.add(currentData);
                previous = current;
            }

            current = current.next;
        }
    }
        public  void printList() {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.data + " ->");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedListCheckDuplicate linkedList = new LinkedListCheckDuplicate();
            linkedList.head = new Node(1);
            linkedList.head.next = new Node(2);
            linkedList.head.next.next = new Node(3);
            linkedList.head.next.next.next = new Node(2);
            linkedList.head.next.next.next.next = new Node(4);

            System.out.println("Original Linked List:");
            linkedList.printList();

            linkedList.removeDuplicates();

            System.out.println("Linked List after removing duplicates:");
            linkedList.printList();
        }


}

