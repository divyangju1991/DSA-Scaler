package com.scaler.dsa.recursion;

// 1 2 3 4 5 6
// 0 1 1 2 3 5
public class Fibonaaci {

	public int fibonaaci(int n){
		
		if(n == 1 || n == 2){
			return n-1;
		}
		
		return fibonaaci(n-1) + fibonaaci(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Fibonaaci().fibonaaci(5));
		
		System.out.println(new Fibonaaci().fibonaaci(6));
	}

}
