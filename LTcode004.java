public class LTcode004{

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to add two numbers represented by linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Placeholder for the result list
        ListNode current = dummyHead; // Pointer to construct the result
        int carry = 0;

        // Traverse both linked lists until both are null
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry from the previous step
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node in l1
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node in l2
            }

            carry = sum / 10; // Calculate the new carry
            current.next = new ListNode(sum % 10); // Create the current digit node
            current = current.next; // Move to the next node
        }

        return dummyHead.next; // The next node is the actual head of the result list
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the addTwoNumbers function
    public static void main(String[] args) {
        // Test case 1: (2 -> 4 -> 3) + (5 -> 6 -> 4) -> Result: 7 -> 0 -> 8
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465
        ListNode result = addTwoNumbers(l1, l2);
        printList(result); // Output: 7 0 8

        // Test case 2: (0) + (0) -> Result: 0
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        result = addTwoNumbers(l3, l4);
        printList(result); // Output: 0

        // Test case 3: (9 -> 9 -> 9) + (1) -> Result: 0 -> 0 -> 0 -> 1
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9))); // 999
        ListNode l6 = new ListNode(1); // 1
        result = addTwoNumbers(l5, l6);
        printList(result); // Output: 0 0 0 1
    }
}
