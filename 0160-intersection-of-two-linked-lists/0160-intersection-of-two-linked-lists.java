/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast=headA;
        ListNode slow=headB;
        if(headA==headB) return headA;
        while(slow!=null&&fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(slow==fast && slow==null) return slow;
            if(slow==null) slow=headA;
            else if(fast==null) fast=headB;
            if(slow==fast) return slow;
        }
        return null;
    }
}