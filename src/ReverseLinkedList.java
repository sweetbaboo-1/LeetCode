import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public static class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

    public static Node reverseListRecursive(Node node) {
        if (node == null) {
            return null;
        }
        Node newHead = node;
        if (node.next != null) {
            newHead = reverseListRecursive(node.next);
            node.next.next = node;
        }
        node.next = null;
        return newHead;
    }

    public static Node reverseListTwoPointer(Node node) {
        if (node == null || node.next == null) {
            return null;
        }

        Node curr = node.next;
        Node prev = node;
        prev.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node reverseListList(Node node) {
        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return node;
        }

        List<Node> nodes = new ArrayList<>();
        while (node != null) {
                nodes.add(node);
                node = node.next;
        }
        Node dummy = new Node();
        Node head = dummy;
        for (int i = nodes.size() - 1; i >= 0; i--) {
            dummy.next = nodes.get(i);
            dummy = dummy.next;
        }
        dummy.next = null;
        return head.next;
    }
}
