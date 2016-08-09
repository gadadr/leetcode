package oj_1_20;

public class OJ_02_AddTwoNumbers {
	
	public Node addTwoNumbers(Node l1, Node l2) {
       if (l1 == null) {
        	return l2;
        } else if (l2==null) {
        	return l1;
        }
        
        Node ans = null;
        Node first = null;
        int carry;
        
        int target = l1.val+l2.val;
        carry = target/10;
        ans = new Node(target%10);
        first = ans;
   
        while (l1.next != null && l2.next != null) {
        	l1 = l1.next;
        	l2 = l2.next;
        	
        	target = l1.val+l2.val+carry;
        	first.next = new Node(target%10);
        	first = first.next;
        	carry = target/10;
        }
        
        while(l1.next != null) {
        	l1 = l1.next;
        	first.next = new Node((l1.val+carry)%10);
        	first = first.next;
        	carry = (l1.val+carry)/10;
        }
        
        while(l2.next != null) {
        	l2 = l2.next;
        	first.next = new Node((l2.val+carry)%10);
        	first = first.next;
        	carry=(l2.val+carry)/10;
        }
        
        if (carry>0) {
            first.next = new Node(carry);
            first = first.next;
        }
        first.next = null;
        return ans;
        
    }
}
