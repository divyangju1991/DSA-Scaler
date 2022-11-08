package com.scaler.dsa.linkedList.assignment;

import java.util.*;

import com.scaler.dsa.linkedList.assignment.KReverseLinkedList.ListNode;

public class RemoveLoop2_v2 {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode solve(ListNode head) {

		detectAndRemoveLoop2_v2(head);
        return head;
    }
	
    int detectAndRemoveLoop2_v2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                removeLoop2_v2(slow, head);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop 
    void removeLoop2_v2(ListNode loop, ListNode curr) {
        ListNode ptr1 = null;
        ListNode ptr2 = null;
        
        ptr1 = curr;
        while (1 == 1) {
            
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            
            if (ptr2.next == ptr1) {
                break;
            }
            
            ptr1 = ptr1.next;
        }
        
        ptr2.next = null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveLoop2_v2.ListNode cycleNode = new RemoveLoop2_v2().new ListNode(2);
		
		RemoveLoop2_v2.ListNode node = new RemoveLoop2_v2().new ListNode(1);
		node.next = cycleNode;
		node.next.next = new RemoveLoop2_v2().new ListNode(3);
		node.next.next.next = new RemoveLoop2_v2().new ListNode(4);
		node.next.next.next.next = cycleNode;
		
		RemoveLoop2_v2.ListNode ansNode = new RemoveLoop2_v2().solve(node);
		System.out.println(ansNode);
		
		cycleNode = new RemoveLoop2_v2().new ListNode(90);
		RemoveLoop2_v2.ListNode node2 = cycleNode;
		node2.next = new RemoveLoop2_v2().new ListNode(10);
		node2.next.next = new RemoveLoop2_v2().new ListNode(20);
		node2.next.next.next = new RemoveLoop2_v2().new ListNode(40);
		node2.next.next.next.next = cycleNode;
		
		ansNode = new RemoveLoop2_v2().solve(node2);
		System.out.println(ansNode);
	}

}
