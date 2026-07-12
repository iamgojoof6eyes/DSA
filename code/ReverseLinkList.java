public class ReverseLinkList {
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

    public static Node reverse (Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}