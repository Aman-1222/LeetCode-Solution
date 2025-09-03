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
    public ListNode reverseLL(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseLL(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first=head;
        ListNode newHead=reverseLL(slow.next);
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val) {
                reverseLL(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseLL(newHead);
        return true;


    }
}