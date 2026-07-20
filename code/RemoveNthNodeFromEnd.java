//Remove nth node from end of linked list

public class RemoveNthNodeFromEnd {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this(data, null);
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node front = dummy;
        Node back = dummy;

        for (int i = 0; i <= n; i++) {
            front = front.next;
        }

        while (front != null) {
            front = front.next;
            back = back.next;
        }

        back.next = back.next.next;
        return dummy.next;
    }
}
