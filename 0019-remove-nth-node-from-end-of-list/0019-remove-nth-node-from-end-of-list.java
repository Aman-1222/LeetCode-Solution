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
        int len=0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n) return head.next;
        temp = nodeFromFront(head,len-n);
        temp.next=temp.next.next;
        return head;
    }

    public ListNode nodeFromFront(ListNode head,int n){
        ListNode temp = head;
        while(n>0){
            n--;
            if(n==0) return temp;
            temp=temp.next;
        }
        return null;
    } 
}