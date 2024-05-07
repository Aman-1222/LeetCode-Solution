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
        ListNode newHead=rev(head);
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        int carry=0;
        while(newHead!=null){
            carry=newHead.val*2+carry;
            temp.next=new ListNode(carry%10);
            temp=temp.next;
            carry/=10;
            newHead=newHead.next;
        }
        if(carry>0) 
            temp.next=new ListNode(carry);
        rev(head);
        return rev(ans.next);
    }
    public static ListNode rev(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode newHead=rev(head.next);
        temp.next.next=temp;
        temp.next=null;
        return newHead;
    }
}