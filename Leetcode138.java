import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Leetcode138 {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
        Leetcode138 solution = new Leetcode138();

        // Create test list: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        head.random = null;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;

        Node result = solution.copyRandomList(head);

        // Print result
        Node curr = result;
        while (curr != null) {
            System.out.print("[" + curr.val + "," +
                    (curr.random == null ? "null" : curr.random.val) + "] -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}