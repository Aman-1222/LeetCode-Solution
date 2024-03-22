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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp1=reverse(slow.next);
        ListNode temp2=temp1;
        ListNode temp3=head;
        while(temp2!=null){
            if(temp2.val!=temp3.val) return false;
            temp2=temp2.next;
            temp3=temp3.next;
        }
        slow.next=reverse(temp1);
        return true;
    }
    
    public ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode curr=node;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
}