package com.scaler.dsa.recursion.backtracking.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Worst_Efforts_Solution_2 {

	  private void genGrayCodes(int index, int[] a, Map<Integer, List<Integer>> grayCodes){
	        if(index == a.length){
	            List<Integer> tmp = binaryToGrayCode(Arrays.stream(a).boxed().collect(Collectors.toList()));
	            grayCodes.put(genValue(tmp), tmp);
	            return;
	        }
	        a[index] = 0;
	        genGrayCodes(index+1, a, grayCodes);
	        a[index] = 1;
	        genGrayCodes(index+1, a, grayCodes);
	    }

	    private int genValue(List<Integer> list){
	            int ans = 0;
	            for(int i=list.size()-1, j=0; i>=0; i--, j++){
	            		if(list.get(i) == 1){
	            			ans += (int) Math.pow(2, j);  
	            		}
	            }
	            return ans;
	    }
	    
	    private List<Integer> binaryToGrayCode(List<Integer> list){
	    	
	    	List<Integer> grayCodes = new ArrayList<>();
	    	
	    	if(list != null && !list.isEmpty()){
	    		grayCodes.add(list.get(0));
	    	}
	    	
	    	for(int i=1; i<list.size(); i++){
	    		 int add = list.get(i-1) ^ list.get(i);
	    		 grayCodes.add(add);
	    	}
	    	
	    	return grayCodes;
	    }

		public ArrayList<Integer> grayCode(int a) {

	        int[] arr = new int[a];
	        Map<Integer, List<Integer>> grayCodes = new LinkedHashMap<>();

	        genGrayCodes(0, arr, grayCodes);
	        
	        System.out.println(grayCodes);

	        ArrayList<Integer> ans = new ArrayList<Integer>();
			for(Map.Entry<Integer, List<Integer>> entry : grayCodes.entrySet()){
				ans.add(entry.getKey());
				if(entry.getKey().intValue() == a){
					break;
				}
			}
	        return ans;
		}
	
	public static void main(String[] args) {
		System.out.println(new Worst_Efforts_Solution_2().grayCode(10));
	}
}
