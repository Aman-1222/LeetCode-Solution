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
    public int getDecimalValue(ListNode head) {
        int num=len(head)-1;
        ListNode temp=head;
        int ans=0;
        while(num>=0){
            ans+=temp.val*Math.pow(2,num);
            temp=temp.next;
            num--;
        }
        return ans;
    }

    public static int len(ListNode head){
        int num=0;
        while(head!=null){
            num++;
            head=head.next;
        }
        return num;
    }
}