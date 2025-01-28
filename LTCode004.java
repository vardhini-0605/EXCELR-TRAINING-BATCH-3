class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }

    private static ListNode createList(int[] vals) {
        ListNode dummy = new ListNode(0), current = dummy;
        for (int val : vals) current = current.next = new ListNode(val);
        return dummy.next;
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LTCode004 solution = new LTCode004();
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        System.out.println("Input List 1:");
        printList(l1);
        System.out.println("Input List 2:");
        printList(l2);

        System.out.println("Result List:");
        printList(solution.addTwoNumbers(l1, l2));
    }
}