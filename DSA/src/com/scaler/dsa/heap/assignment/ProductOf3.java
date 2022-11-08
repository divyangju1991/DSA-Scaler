package com.scaler.dsa.heap.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOf3 {
	
	public int[] solve(int[] a) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = a.length;
        int[] ans = new int[n];

        for(int i=0; i<n; ++i){

            pq.add(a[i]);

            if(i < 2){
                ans[i] = -1;
            } else {
                int p1 = pq.poll();
                int p2 = pq.poll();
                int p3 = pq.poll();
                pq.add(p1);
                pq.add(p2);
                pq.add(p3);

                ans[i] = p1*p2*p3;
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(new ProductOf3().solve(a)));
	}

}
