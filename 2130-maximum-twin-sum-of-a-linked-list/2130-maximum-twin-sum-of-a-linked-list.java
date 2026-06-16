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
    public int pairSum(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode revHead = rev(slow.next);
        ListNode temp=head;
        ListNode tempRevHead = revHead;
        int max=0;
        while(tempRevHead!=null){
            max=Math.max(max,tempRevHead.val+temp.val);
            temp=temp.next;
            tempRevHead=tempRevHead.next;
        }
        rev(revHead);
        return max;
    }

    public ListNode rev(ListNode head){
        if(head.next==null) return head;
        ListNode revHead = rev(head.next);
        head.next.next=head;
        head.next=null;
        return revHead;
    }
}
