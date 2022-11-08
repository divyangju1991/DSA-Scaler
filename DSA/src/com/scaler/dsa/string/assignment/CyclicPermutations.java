package com.scaler.dsa.string.assignment;

public class CyclicPermutations {
	
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

   public int solve(String a, String b) {

       if(a == null || a.trim().isEmpty() || b == null || b.trim().isEmpty()){
	    	return 0;
	    }

       // concatenate b with b
       b = b + b;
       // new b now contains all the cyclic
       // permutations of old b as it's sub-strings
       b = b.substring(0, b.length() - 1);
	    	
	   String s = a + "$" + b;
       int n = s.length();

	    int z[] = new int[n];

	    create_Zarr(s, z);

       int ans = 0;

        for (int i = 1; i <= n - 1; i++) {
    
           // pattern occurs at index i since
           // z value of i equals pattern length
           if (z[i] == a.length())
               ans++;
       }
       return ans;
       
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CyclicPermutations().solve("1001", "0011"));
		
		System.out.println(new CyclicPermutations().solve("111", "111"));
	}

}
