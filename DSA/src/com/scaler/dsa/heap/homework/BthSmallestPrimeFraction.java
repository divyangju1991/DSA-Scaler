package com.scaler.dsa.heap.homework;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BthSmallestPrimeFraction {
	
	public int[] solve(int[] A, int K) {

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) ->
                A[a[0]] * A[b[1]] - A[a[1]] * A[b[0]]);

        for (int i = 1; i < A.length; ++i)
            pq.add(new int[]{0, i});

        while (--K > 0) {
            int[] frac = pq.poll();
            if (frac[0]++ < frac[1])
                pq.offer(frac);
        }

        int[] ans = pq.poll();
        return new int[]{A[ans[0]], A[ans[1]]};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(new BthSmallestPrimeFraction().solve(new int[]{1, 2, 3, 5}, 3)));
		
		System.out.println(Arrays.toString(new BthSmallestPrimeFraction().solve(new int[]{1, 7}, 1)));
	}

}
