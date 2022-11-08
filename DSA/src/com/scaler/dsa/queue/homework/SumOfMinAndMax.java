package com.scaler.dsa.queue.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinAndMax {
	
public int solve(ArrayList<Integer> list, int k) {
        
        int sum = 0;  // Initialize result
        int mod = (1000 * 1000 * 1000) + 7;
   
        // The queue will store indexes of useful elements
        // in every window
        // In deque 'deQueueDSC' we maintain decreasing order of
        // values from front to rear
        // In deque 'deQueueAsc' we  maintain increasing order of
        // values from front to rear
        Deque<Integer> deQueueAsc = new LinkedList<>();
        Deque<Integer> deQueueDSC = new LinkedList<>();
 
        // Process first window of size K
        int i = 0;
        for (i = 0; i < k; i++)
        {
            // Remove all previous greater elements
            // that are useless.
            while ( !deQueueAsc.isEmpty() && list.get(deQueueAsc.peekLast()) >= list.get(i))
                deQueueAsc.removeLast(); // Remove from rear
   
            // Remove all previous smaller that are elements
            // are useless.
            while ( !deQueueDSC.isEmpty() && list.get(deQueueDSC.peekLast()) <= list.get(i))
                deQueueDSC.removeLast(); // Remove from rear
   
            // Add current element at rear of both deque
            deQueueDSC.addLast(i);
            deQueueAsc.addLast(i);
        }
   
        // Process rest of the Array elements
        for (  ; i < list.size(); i++ )
        {
            // Element at the front of the deque 'deQueueDSC' & 'deQueueAsc'
            // is the largest and smallest
            // element of previous window respectively
            sum += list.get(deQueueAsc.peekFirst()) + list.get(deQueueDSC.peekFirst());
            sum = (sum + mod) % mod;
   
            // Remove all elements which are out of this
            // window
            while ( !deQueueAsc.isEmpty() && deQueueAsc.peekFirst() <= i - k)
                deQueueAsc.removeFirst();
            while ( !deQueueDSC.isEmpty() && deQueueDSC.peekFirst() <= i - k)
                deQueueDSC.removeFirst();
   
            // remove all previous greater element that are
            // useless
            while ( !deQueueAsc.isEmpty() && list.get(deQueueAsc.peekLast()) >= list.get(i))
                deQueueAsc.removeLast(); // Remove from rear
   
            // remove all previous smaller that are elements
            // are useless
            while ( !deQueueDSC.isEmpty() && list.get(deQueueDSC.peekLast()) <= list.get(i))
                deQueueDSC.removeLast(); // Remove from rear
   
            // Add current element at rear of both deque
            deQueueDSC.addLast(i);
            deQueueAsc.addLast(i);
        }
   
        // Sum of minimum and maximum element of last window
        sum += list.get(deQueueAsc.peekFirst()) + list.get(deQueueDSC.peekFirst());
   
        return (sum + mod) % mod;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, -1, 7, -3, -1, -2));
		int k = 4;
		System.out.println(new SumOfMinAndMax().solve(list, k));
		
		list = new ArrayList<>(Arrays.asList(2, -1, 3));
		k = 2;
		System.out.println(new SumOfMinAndMax().solve(list, k));
		
		int mod = (1000 * 1000 * 1000) + 7;
		int test = -166067;
		int testResult = (test + mod) % mod;
		System.out.println(testResult);//999833940 999833940
	}

}
