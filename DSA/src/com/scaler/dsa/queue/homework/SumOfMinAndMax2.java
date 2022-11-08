package com.scaler.dsa.queue.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SumOfMinAndMax2 {
	
	public int solve(ArrayList<Integer> list, int B) {
        
		int mod = 1000 * 1000 * 1000 + 7;
        Deque < Integer > minn = new ArrayDeque < Integer > ();
        Deque < Integer > maxx = new ArrayDeque < Integer > ();
        int i = 0;
        for (; i < B; i++) {
            while (minn.size() > 0 && list.get(minn.getLast()) >= list.get(i)) {
                minn.removeLast();
            }
            minn.addLast(i);
            while (maxx.size() > 0 && list.get(maxx.getLast()) <= list.get(i)) {
                maxx.removeLast();
            }
            maxx.addLast(i);
        }
        long sum = list.get(minn.getFirst()) + list.get(maxx.getFirst());
        while (i < list.size()) {
            while (minn.size() > 0 && list.get(minn.getLast()) >= list.get(i)) {
                minn.removeLast();
            }
            minn.addLast(i);
            while (i - minn.getFirst() >= B) {
                minn.removeFirst();
            }
            while (maxx.size() > 0 && list.get(maxx.getLast()) <= list.get(i)) {
                maxx.removeLast();
            }
            maxx.addLast(i);
            while (i - maxx.getFirst() >= B) {
                maxx.removeFirst();
            }
            sum += list.get(maxx.getFirst()) + list.get(minn.getFirst());
            sum %= mod;
            i++;
        }
        sum += mod;
        sum %= mod;
        
        return (int) sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, -1, 7, -3, -1, -2));
		int k = 4;
		System.out.println(new SumOfMinAndMax2().solve(list, k));
		
		list = new ArrayList<>(Arrays.asList(2, -1, 3));
		k = 2;
		System.out.println(new SumOfMinAndMax2().solve(list, k));
		
		int mod = (1000 * 1000 * 1000) + 7;
		int test = -166067;
		int testResult = (test + mod) % mod;
		System.out.println(testResult);//999833940 999833940
	}

}
