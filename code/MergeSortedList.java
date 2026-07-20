public class MergeSortedList {
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

    public Node merge(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node temp = new Node(1);
        Node mergedList = temp;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }
        if (list1 != null) {
            mergedList.next = list1;
        } else {
            mergedList.next = list2;
        }
        return temp.next;
    }
}
