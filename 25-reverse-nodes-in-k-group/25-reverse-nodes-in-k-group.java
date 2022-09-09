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
    
     public static void reverse(ListNode start, ListNode end)
        {
            ListNode pre = null;
            ListNode curr = start;
            ListNode forw = null;
            
            while(pre != end)
            {
                forw = curr.next;
                curr.next = pre;
                
                pre = curr;
                curr = forw;
            }
        }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
    
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode beforeStart = dummy;
        
        ListNode end = head;
        int count = 0;
        
        while(end != null)
        {
            count++;
            if(count % k == 0)
            {
                // Reverse first
                ListNode start = beforeStart.next;
                ListNode temp = end.next;
                
                reverse(start, end);
                beforeStart.next = end;
                start.next = temp;
                beforeStart = start;
                end = temp;
            }
            else
            {
                end = end.next;
            }
        }
        return dummy.next;
        
    }
}
