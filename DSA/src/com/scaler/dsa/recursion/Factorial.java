package com.scaler.dsa.recursion;

public class Factorial {
	
	public int fact(int num) {
		
		if(num == 1){
			return 1;
		}
		
		return fact(num - 1)*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Factorial().fact(5));
		System.out.println(new Factorial().fact(6));
	}

}
