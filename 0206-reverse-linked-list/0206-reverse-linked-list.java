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
    public ListNode reverseList(ListNode head) {
       return reverse(null,head);
    }
    public ListNode reverse(ListNode prev,ListNode curr){
        if(curr==null){
            return prev;
        }
        ListNode n=curr.next;
        curr.next=prev;
        prev=curr;
        return reverse(prev,n);
    }
}