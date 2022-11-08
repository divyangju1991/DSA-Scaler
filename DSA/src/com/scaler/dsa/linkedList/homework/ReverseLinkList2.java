package com.scaler.dsa.linkedList.homework;


public class ReverseLinkList2 {
	
	class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	 }
	
	public ListNode reverseBetween(ListNode head, int b, int c) {
		 
		 ListNode first = null;
		 ListNode from = null;
		 ListNode to = null;
		 ListNode last = null;
		 ListNode current = head;
		 int count = 0;
		 		 
		 while(current != null){
			 ++count;
			 if(count < b){
				 first = current;
			 }
			 
			 if(count == b){
				 from = current;
			 }
			 
			 if(count == c){
				 to = current;
				 last = to.next;
                break;
			 }
			 
			 current = current.next;
		 }
		 
		 to.next = null;
		 to = reverse(from);
		 
		 if(first != null){
			 first.next = to;
		 } else {
			 head = to;
		 }
		 
		 from.next = last;
		 
		 return head;
	 }
		 
	 public ListNode reverse(ListNode head) {	 
		
		 ListNode current = head;
	     ListNode prev = null;
	     ListNode next = null;

	     while(current != null){
	          next = current.next;
	          current.next = prev;
	          prev = current;
	          current = next;
	     }
	     
        return prev;
	 }
	 
	 /*
	 public ListNode reverseBetween(ListNode head, int b, int c) {
	      
	      	      
	      int count = 1;
	      ListNode current = head;
	      ListNode tmpPrev = null;
	      ListNode tmpHead = head;
	      ListNode next = null;
	      
	      if(head.next == null){
	    	  return head;
	      }	     
	      
	      while(count < b && current != null){
	    	  tmpPrev = current;
	    	  current = current.next;
	    	  ++count;
	      }
	      
	      if(tmpPrev != null){
	    	  tmpPrev.next = null;
	      }
	      
	      ListNode prev = null;

	      while(count <= c){
	          next = current.next;
	          current.next = prev;
	          prev = current;
	          current = next;
	          ++count;
	      }
	      
	      if(current != null){
	    	  current.next = null;
	      }

	     
	      tmpHead.next = prev;
	      return tmpHead;

	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkList2.ListNode node = new ReverseLinkList2().new ListNode(1);
		node.next = new ReverseLinkList2().new ListNode(2);
		node.next.next = new ReverseLinkList2().new ListNode(3);
		System.out.println(new ReverseLinkList2().reverseBetween(node, 2, 3));
		
		node = new ReverseLinkList2().new ListNode(1);
		node.next = new ReverseLinkList2().new ListNode(2);
		node.next.next = new ReverseLinkList2().new ListNode(3);
		System.out.println(new ReverseLinkList2().reverseBetween(node, 1, 2));
	}

}
