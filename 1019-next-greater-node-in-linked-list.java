/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public int[] nextLargerNodes(ListNode head) {

        int n = 0;
        for (ListNode p = head; p != null; p = p.next)
            n++;

        int[] values = new int[n];
        int[] ans = new int[n];
        int[] stack = new int[n];

        int i = 0;
        while (head != null) {
            values[i++] = head.val;
            head = head.next;
        }

        int top = -1;

        for (i = 0; i < n; i++) {

            while (top >= 0 && values[i] > values[stack[top]]) {
                ans[stack[top--]] = values[i];
            }

            stack[++top] = i;
        }

        return ans;
    }

}
