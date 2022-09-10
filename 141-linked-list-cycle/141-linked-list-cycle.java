/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null)
        {
            return false;
        }
        
        if(head.next == null)
        {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow != null && fast != null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
            }
            slow = slow.next;
            
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}