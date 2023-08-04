class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedLists {
    public static void main(String[] args) {
        ListNode list1 = createLinkedList(new int[]{3, 2, 1});
        ListNode list2 = createLinkedList(new int[]{6, 5, 4});
        ListNode result = addTwoNumbers(list1, list2);
        printLinkedList(result); 
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;
            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static ListNode createLinkedList(int[] digits) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
