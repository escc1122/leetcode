package AddTwoNumbers;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode root = null;
        ListNode previousNode = null;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = ((l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry) % 10;
            if (root == null) {
                root = new ListNode(sum);
                previousNode = root;
            } else {
                ListNode currNode = new ListNode();
                currNode.val = sum;
                previousNode.next = currNode;
                previousNode = currNode;
            }

            carry = ((l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry) / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }


        }
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}