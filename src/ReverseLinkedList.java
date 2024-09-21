public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        head.printList(head);
        head = reverseList(head);
        System.out.print("\nReversed Linked List:");
        head.printList(head);
    }
    private static Node reverseList(Node head){
        if(head==null)
            return null;
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
