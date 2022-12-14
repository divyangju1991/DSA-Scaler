package com.scaler.dsa.hashing.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CompareSortedArrays {
	
	Random r = new Random(System.currentTimeMillis());

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        int presum[] = new int[100001];
        int hashcode[] = new int[100001];
        for(int i = 0; i<A.size(); i++){
        	if(hashcode[A.get(i)] == 0){
        		hashcode[A.get(i)] = hash();
        	}
        }
        presum[0] = hashcode[A.get(0)];
        for(int i = 1; i < A.size(); i++){
            presum[i] = presum[i-1] + hashcode[A.get(i)];
        }
        
        for(int i=0;i<B.size();i++){
            int l1 = B.get(i).get(0);
            int r1 = B.get(i).get(1);
            int l2 = B.get(i).get(2);
            int r2 = B.get(i).get(3);
            int v1 = presum[r1] - ((l1 > 0) ? presum[l1-1] : 0);
            int v2 = presum[r2] - ((l2 > 0) ? presum[l2-1] : 0);
            if(v1==v2){
                out.add(1);
            }else{
                out.add(0);
            }
        }
        return out;
    }
	
	private int hash(){
		
		int mod = (1000 * 1000 * 1000) + 7;
	    int hashCode = (mod + r.nextInt(100000)) % mod;
		
	    return hashCode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 7, 11, 8, 11, 7, 1));
		
		ArrayList<Integer> tmp = new ArrayList<>(Arrays.asList(0, 2, 4, 6));
		
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		B.add(tmp);
		
		System.out.println(new CompareSortedArrays().solve(A, B));
		
		
		A = new ArrayList<>(Arrays.asList(5, 3, 4, 4));
		
		tmp = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
		
		B = new ArrayList<>();
		B.add(tmp);
		
		System.out.println(new CompareSortedArrays().solve(A, B));
	}

}
