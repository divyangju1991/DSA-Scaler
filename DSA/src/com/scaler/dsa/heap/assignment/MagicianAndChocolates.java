package com.scaler.dsa.heap.assignment;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
	
	public int nchoc(int A, int[] B) {

        int mod = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<B.length;i++){
            pq.add(B[i]);
        }
        long ans =0;
        while(A-- != 0){
            int n = pq.poll();
            ans += n;
            ans %= mod;
            pq.add(n/2);
        }
        return (int)ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
