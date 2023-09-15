import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AllOne {

    public HashMap<String, Node> map;
    public Node head;
    public Node tail;

    private static class Node {
        int value;
        Set<String> strings;
        Node next;
        Node prev;

        public Node(int value, Set<String> strings, Node next, Node prev) {
            this.value = value;
            this.strings = strings;
            this.next = next;
            this.prev = prev;
        }
    }

    public AllOne() {
        map = new HashMap<>();
        head = null;
        tail = null;
    }

    public void inc(String key) {
        if (map.get(key) != null) { // not a new string
            Node node = map.get(key);
            node.strings.remove(key);
            if (node != tail && node.next.value == node.value + 1) {
                node.next.strings.add(key);
                map.put(key, node.next);
            } else if (node != tail) {
                Node newNode = new Node(node.value + 1, new HashSet<>(), node.next, node);
                newNode.strings.add(key);
                node.next.prev = newNode;
                node.next = newNode;
                map.put(key, newNode);
            } else {
                Node newTail = new Node(node.value + 1, new HashSet<>(), null, tail);
                newTail.strings.add(key);
                map.put(key, newTail);
                tail.next = newTail;
                tail = newTail;
            }
            if (node.strings.size() == 0) {
                removeNode(node);
            }
        } else {
            if (head != null && head.value == 1) { // head could be null
                head.strings.add(key);
                map.put(key, head);
            } else if (head != null) {
                Node newNode = new Node(1, new HashSet<>(), head, null);
                newNode.strings.add(key);
                head.prev = newNode;
                head = newNode;
                map.put(key, head);
            } else {
                Node newHead = new Node(1, new HashSet<>(), null, null);
                newHead.strings.add(key);
                map.put(key, newHead);
                head = newHead;
                if (tail == null)
                    tail = head;
            }
        }
    }

    public void dec(String key) {
        // we know that the string must exist somewhere, so we know it's in the map
        Node node = map.get(key);
        node.strings.remove(key);

        if (node.prev != null && node.prev.value == node.value - 1) { // there is a node and it's the right one
            node.prev.strings.add(key);
            map.put(key, node.prev);
        } else if (node.prev != null) { // there is a node but it's the wrong one
            Node newNode = new Node(node.value - 1, new HashSet<>(), node, node.prev);
            newNode.strings.add(key);
            node.prev.next = newNode;
            node.prev = newNode;
            map.put(key, newNode);
        } else { // there isn't a node so we must be in the head node
            if (node.value == 1) {
                map.remove(key);
                if (node.strings.size() == 0) {
                    removeNode(node);
                }
                return;
            }
            Node newHead = new Node(node.value - 1, new HashSet<>(), node, null);
            newHead.strings.add(key);
            node.prev = newHead;
            head = newHead;
            map.put(key, head);
        }

        // remove stuff at the end, so we don't lose our pointers
        if (node.strings.size() == 0) {
            removeNode(node);
        }
    }

    public String getMaxKey() {
        if (tail == null)
            return "";
        else return tail.strings.iterator().next();
    }

    public String getMinKey() {
        if (head == null)
            return "";
        else return head.strings.iterator().next();
    }

    private void removeNode(Node node) {
        if (node == head) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            }
        } else if (node == tail) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            }
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
}