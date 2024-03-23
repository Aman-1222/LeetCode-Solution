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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        HashMap<Integer,ListNode> mpp=new HashMap<>();
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            mpp.put(i,temp);
            temp=temp.next;
            i++;
        }
        int low=0,high=i-1;
        ListNode dummy=new ListNode(-1);
        ListNode newList=dummy;
        while(low<high){
            newList.next = mpp.get(low);
            newList=newList.next;
            newList.next = mpp.get(high);
            newList=newList.next;
            low++;
            high--;          
        }
        if(low==high){
            newList.next = mpp.get(low);
            newList=newList.next;
            newList.next=null;       
    }
        else newList.next=null;
        head=dummy.next;   
}
}