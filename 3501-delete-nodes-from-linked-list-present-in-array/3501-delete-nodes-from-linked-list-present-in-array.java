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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        while(head!=null){
            if(set.contains(head.val))
                head=head.next;
            else{
                temp.next=head;
                temp=temp.next;
                head=head.next;
        }
        }
        temp.next=null;
        return ans.next;
        
    }
}