package com.scaler.dsa.linkedList.assignment;

import com.scaler.dsa.linkedList.assignment.RemoveNthNodeFromEnd.ListNode;

/**
 * 
 * @author Divyang
 *
 * 
 Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]
 
 Wrong Understanding :
 O/P 1 : [2, 3, 4, 5, 6, 1]
 */
public class WrongUnderstandingKReverseLinkedList {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode reverseList(ListNode head, int k) {
		
		if(head == null){
			return null;
		} else if(k == 0){
			return head;
		}
		
		ListNode tmp = head;
		ListNode head2 = head;
		int i = 1;
		
		while(i < k && tmp != null && tmp.next != null){
			tmp = tmp.next;
			++i;
		}
		
		if(tmp != null){
			head2 = tmp;
		}
		
		while(tmp != null && tmp.next != null){
			tmp = tmp.next;
		}

        tmp.next = head;
		
		i=1;
		while(i < k && tmp != null){
			tmp = tmp.next;
            ++i;
		}
		
		if(tmp != null){
			tmp.next = null;
		}
		
		return head2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongUnderstandingKReverseLinkedList.ListNode node = new WrongUnderstandingKReverseLinkedList().new ListNode(1);
		node.next = new WrongUnderstandingKReverseLinkedList().new ListNode(2);
		node.next.next = new WrongUnderstandingKReverseLinkedList().new ListNode(3);
		node.next.next.next = new WrongUnderstandingKReverseLinkedList().new ListNode(4);
		node.next.next.next.next = new WrongUnderstandingKReverseLinkedList().new ListNode(5);
		
		WrongUnderstandingKReverseLinkedList.ListNode ansNode = new WrongUnderstandingKReverseLinkedList().reverseList(node, 2);
		System.out.println(ansNode);
	}

}
