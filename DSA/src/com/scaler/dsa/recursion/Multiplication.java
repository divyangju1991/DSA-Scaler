package com.scaler.dsa.recursion;

public class Multiplication {

	public int mul(int a[], int n){
        if(n == 0){
            return 1;
        }
        return mul(a, (n -1))*a[n-1];
    }

    public static void main(String args[]){
        int[] a = new int[]{10,5,1,1,1,1,1,1,1};
        System.out.println(new Multiplication().mul(a, a.length));
    }

}
