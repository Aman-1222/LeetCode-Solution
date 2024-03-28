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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int diff=cnt-n;
        if(diff==0) return head.next;
        ListNode temp1=head;
        while(diff>1){
            temp1=temp1.next;
            diff--;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}