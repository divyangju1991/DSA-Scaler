package com.scaler.dsa.hashing.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountRectangles {
	
	private Map<String, Integer> getFreqMap(ArrayList<Integer> A, ArrayList<Integer> B){
		
		 int n = A.size();
	     Map<String, Integer> map = new HashMap<>();
	     
	     for(int i=0; i<n; i++){
	    	 String key = A.get(i)+","+B.get(i);
	    	 map.put(key, 1);
	     }
	     
	     return map;
	        
	}
	//&& A.get(i) != B.get(j) && B.get(i) != A.get(j)
	public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
       int n = A.size();
       Map<String, Integer> map = getFreqMap(A, B);
       int count=0;
       
       for(int i=0; i<n; i++){
       	
       	for(int j=i+1; j<n; j++){
       		
       		if(A.get(i).intValue() != A.get(j).intValue() && B.get(i).intValue() != B.get(j).intValue()) {
       				
       			if(map.get(A.get(i)+","+B.get(j)) != null && map.get(A.get(j)+","+B.get(i)) != null){
       				++count;
       			}
       		}
       	}
       }
       
       return (count==0) ? 0: count/2;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList(Arrays.asList(1302, 589, 651, 279, 1054, 1550, 310, 496, 1519, 992, 1302, 279, 1488, 1488, 434, 1178, 1054, 1054, 930, 930, 682, 341, 775, 62, 434, 899, 992, 1395, 1457, 1085, 1116, 496, 496, 155, 1116, 806, 310, 372, 1116, 496, 744, 93, 186, 372, 1178, 372, 1519, 1271, 0, 124, 31, 620, 93, 155, 465, 1023, 93, 217, 806, 217, 961, 558, 155, 1457, 1457, 124, 403, 992, 1457, 341, 1457, 248, 403));
		ArrayList<Integer> B = new ArrayList(Arrays.asList(1302, 248, 589, 93, 0, 961, 310, 868, 1209, 372, 620, 1178, 1178, 0, 1426, 1519, 310, 899, 403, 620, 1426, 527, 806, 1023, 1085, 1271, 527, 1085, 744, 310, 1240, 527, 341, 775, 62, 651, 806, 31, 1302, 1550, 1209, 713, 527, 1116, 0, 589, 651, 961, 403, 1023, 651, 465, 1488, 248, 961, 93, 589, 124, 93, 682, 1426, 992, 682, 1054, 217, 1426, 1085, 217, 1085, 1488, 1457, 620, 1302));
		
		System.out.println(new CountRectangles().solve(A, B));
	}

}
