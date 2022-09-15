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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // agar dono me se koi ek bhi null hai to return kardo null.
        if(l1 == null || l2 == null) return null;
        
        // ek node bana lege result name se Jisko hm add krne ke bad wapis kar rhe hoge
        ListNode result = new ListNode(0);
        
        // ek aur pointer le lege traverse krne keliye.
        ListNode curr = result;
        
        // ek sum bana lege
        int sum = 0;
        
        while(l1 != null || l2 != null)
        {
            // check krege kahi l1 null to nahi hai.
            if(l1 != null)
            {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            
            // l2 ko bhi check krege.
            if(l2 != null)
            {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
           curr.val = sum % 10;
            
            sum = sum / 10;
            
            if(l1 != null || l2 != null)
            {
                curr.next = new ListNode();
                curr = curr.next;
            }                        
        }
        
        if(sum == 1)
        {
            curr.next = new ListNode(1);
            curr = curr.next;
        }
        
        return result;
    }
}