package com.scaler.dsa.recursion;

public class Power {

	public int power(int b, int p){
		
		if(p == 0) {
			return 1;
		}
		
		return b * power(b, p-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Power().power(2, 4));
		
		System.out.println(new Power().power(2, 5));
	}

}
