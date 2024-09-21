import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        head.printList(head);
        head = removeDuplicates(head);
        System.out.print("\nNew Linked List:");
        head.printList(head);
    }

    private static Node removeDuplicates(Node head) {
        if(head==null || head.next==null)
            return head;
        Set<Integer> set = new HashSet<>();
        Node temp = head;
        set.add(head.data);
        while(temp.next!=null){
            if(set.contains(temp.next.data)){
                temp.next=temp.next.next;
            }
            else{
                set.add(temp.data);
            }
            temp=temp.next;
        }
        return head;
    }
}
