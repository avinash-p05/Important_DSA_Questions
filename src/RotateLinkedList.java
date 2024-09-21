public class RotateLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        head.printList(head);
        head = rotateList(head,7);
        System.out.print("\nRotated Linked List:");
        head.printList(head);
    }

    private static Node rotateList(Node head,int k){
        if(head==null)
            return null;
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        Node start=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        temp.next=head;
        head=start.next;
        start.next=null;
        return head;
    }
}
