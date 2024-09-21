class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
    public void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

}
