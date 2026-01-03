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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        k=k%cnt;
        if(k==0) return head;
        while(k>0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=head;
        ListNode ans=slow.next;
        slow.next=null;
        return ans;
    }
}