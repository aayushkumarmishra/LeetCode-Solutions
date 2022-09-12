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
    
    public ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        ListNode curr = head;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = pre;
            
            pre = curr;
            curr = forw;
        }
        return pre;
    }
    
    public void print(ListNode head)
    {
        ListNode temp = head;
        
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public boolean isPalindrome(ListNode head) {
       
        // i use slow and fast pointer to find mid of ll.
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // now my slow comes on mid of ll.
        
        // here i call reverse function
        // i reverse all the element after mid
        
        slow.next = reverse(slow.next);
        
        ListNode start = head;
        ListNode mid = slow.next;
        
        while(mid != null)
        {
            if(start.val != mid.val) return false;
            
            start = start.next;
            mid = mid.next;
        }
        print(head);
        slow.next = reverse(slow.next);
        print(head);
        return true;
        
    }
}