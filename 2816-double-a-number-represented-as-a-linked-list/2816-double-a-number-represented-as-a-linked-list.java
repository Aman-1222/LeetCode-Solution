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
    public ListNode doubleIt(ListNode head) {
        ListNode newnewHead=rev(head);
        ListNode newHead=newnewHead;
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        int carry=0;
        while(newHead!=null){
            carry=newHead.val*2+carry;
            newHead.val=carry%10;
            carry/=10;
            temp.next=newHead;
            temp=temp.next;
            newHead=newHead.next;
        }
        if(carry>0)
            temp.next=new ListNode(carry);
        
        return rev(ans.next);
    }
    public static ListNode rev(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}