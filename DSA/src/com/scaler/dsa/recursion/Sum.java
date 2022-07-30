package com.scaler.dsa.recursion;

public class Sum {
	
	public int sum(int a[], int n){
        if(n == 0){
            return 0;
        }
        return sum(a, (n -1))+a[n-1];
    }

    public static void main(String args[]){
        int[] a = new int[]{10,5,1,1,1,1,1,1,1};
        System.out.println(new Sum().sum(a, a.length));
    }

}
