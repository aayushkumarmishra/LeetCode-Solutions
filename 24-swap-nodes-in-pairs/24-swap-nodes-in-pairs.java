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
    
   /* public ListNode reverse(ListNode head, int k)
    {   
        if(head == null)
        {
            return head;
        }
        
        ListNode pre = null;
        ListNode curr = head;
        ListNode forw = null;
        
        int count = 0;
        
        while(curr != null && count < k)
        {
            forw = curr.next;
            curr.next = pre;
            
            pre = curr;
            curr = pre;
        }
        
        if(forw != null)
        {
            head.next = reverse(head, k);
        }
        return pre;
    }*/
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
            if(count < 2)
            {
            forw = curr.next;
            curr.next = pre;
            
            pre = curr;
            curr = forw;
            count++;
            }    
        }
        
        if(forw != null)
        {
            head.next = swapPairs(curr);
        }       
        return pre;
       
    }
}