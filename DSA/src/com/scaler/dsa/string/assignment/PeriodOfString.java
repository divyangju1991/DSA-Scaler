package com.scaler.dsa.string.assignment;

public class PeriodOfString {
	
	 private int getAndCheckFromRight(int right, int left, String str, int n, int[] Z, int i){
		 
		 while(right < n && str.charAt(right - left) == str.charAt(right))
             right++;
          
         Z[i] = right - left;
         right--;
         
         return right;
	 }
	
	 private void create_Zarr(String str, int[] Z) {
		 
	        int n = str.length();
	         
	        // [left,right] make a window which matches with
	        // prefix of s
	        int left = 0, right = 0;
	 
	        for(int i = 1; i < n; ++i) {
	 
	            // if i>right nothing matches so we will calculate.
	            // Z[i] using naive way.
	            if(i > right){
	 
	                left = right = i;
	                right = getAndCheckFromRight(right, left, str, n, Z, i);
	 
	            }
	            else{
	 
	                // k = i-left so k corresponds to number which
	                // matches in [left,right] interval.
	                int k = i - left;
	 
	                
	                if(Z[k] < right - i + 1)
	                    Z[i] = Z[k];
	 
	                
	                else{
	 
	 
	                // else start from right and check manually
	                    left = i;
	                    right = getAndCheckFromRight(right, left, str, n, Z, i);
	                }
	            }
	        }
	    }

	    public int solve(String s) {

	    	if(s == null || s.trim().isEmpty()){
	    		return 0;
	    	}
	    	
	        int n = s.length();
	        int z[] = new int[n];

	        create_Zarr(s, z);

	        for(int i=0; i<n; i++){

	            if(i + z[i] == n){
	                return i;
	            }
	        }

	        return n;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PeriodOfString().solve("abababababb"));
		System.out.println(new PeriodOfString().solve("abababab"));
		System.out.println(new PeriodOfString().solve("aaaa"));
	}

}
