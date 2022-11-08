package com.scaler.dsa.linkedList.homework;


public class AddTwoNumbers {
	
	class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode node;
        ListNode prev = null;
        ListNode first = null;
        int carry = 0;
        int sum = 0;
        while (A != null || B != null || carry != 0) {
            node = new ListNode(0);
            sum = carry;
            if (first == null)
                first = node;
            if (prev != null)
                prev.next = node;
            if (A != null) {
                sum += A.val;
                A = A.next;
            }
            if (B != null) {
                sum += B.val;
                B = B.next;
            }
            node.val = sum % 10;
            sum /= 10;
            carry = sum;
            prev = node;
        }
        return first;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers.ListNode node = new AddTwoNumbers().new ListNode(5);
		node.next = new AddTwoNumbers().new ListNode(8);
		node.next.next = new AddTwoNumbers().new ListNode(20);
		
		AddTwoNumbers.ListNode node2 = new AddTwoNumbers().new ListNode(4);
		node2.next = new AddTwoNumbers().new ListNode(11);
		node2.next.next = new AddTwoNumbers().new ListNode(15);
		
		AddTwoNumbers.ListNode ansNode = new AddTwoNumbers().addTwoNumbers(node, node2);

	}

}
