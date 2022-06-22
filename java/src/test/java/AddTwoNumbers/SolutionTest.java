package AddTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode test = new Solution().addTwoNumbers(l1, l2);

        assertEquals(7, test.val);
        assertEquals(0, test.next.val);
        assertEquals(8, test.next.next.val);
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