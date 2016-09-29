package oj_001_020;

import common.ListNode;

public class OJ_002_AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       if (l1 == null) {
        	return l2;
        } else if (l2==null) {
        	return l1;
        }
        
        ListNode ans = null;
        ListNode first = null;
        int carry;
        
        int target = l1.val+l2.val;
        carry = target/10;
        ans = new ListNode(target%10);
        first = ans;
   
        while (l1.next != null && l2.next != null) {
        	l1 = l1.next;
        	l2 = l2.next;
        	
        	target = l1.val+l2.val+carry;
        	first.next = new ListNode(target%10);
        	first = first.next;
        	carry = target/10;
        }
        
        while(l1.next != null) {
        	l1 = l1.next;
        	first.next = new ListNode((l1.val+carry)%10);
        	first = first.next;
        	carry = (l1.val+carry)/10;
        }
        
        while(l2.next != null) {
        	l2 = l2.next;
        	first.next = new ListNode((l2.val+carry)%10);
        	first = first.next;
        	carry=(l2.val+carry)/10;
        }
        
        if (carry>0) {
            first.next = new ListNode(carry);
            first = first.next;
        }
        first.next = null;
        return ans;
        
    }
}
