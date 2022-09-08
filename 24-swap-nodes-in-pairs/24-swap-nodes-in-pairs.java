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
    public ListNode swapPairs(ListNode head) {
        
       if(head == null)
       {
           return null;
       }
        
        ListNode pre = null;
        ListNode curr = head;
        ListNode forw = null;
        
        int count = 0;
        
        while(curr!=null && count < 2)
        {
            forw = curr.next;
            curr.next = pre;
            
            pre = curr;
            curr = forw;
            count++;  
        }
        
        if(forw != null)
        {
            head.next = swapPairs(curr);
        }       
        return pre;
       
    }
}
