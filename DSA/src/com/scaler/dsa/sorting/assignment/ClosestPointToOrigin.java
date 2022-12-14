package com.scaler.dsa.sorting.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ClosestPointToOrigin {

	public ArrayList<ArrayList<Integer>> closestPoints(ArrayList<ArrayList<Integer>> list, int k) {
		
		Collections.sort(list, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> p1, ArrayList<Integer> p2){
				return ((p1.get(0) * p1.get(0) + p1.get(1) * p1.get(1)) - (p2.get(0) * p2.get(0)  + p2.get(1) * p2.get(1)));
			}
		});
		
		ArrayList<ArrayList<Integer>> output = new ArrayList<>();
		for(int i=0; i<k; i++){
			output.add(list.get(i));
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		list.add(new ArrayList<Integer>(Arrays.asList(1, 3)));
		list.add(new ArrayList<Integer>(Arrays.asList(-2, 2)));
		
		int k = 1;
		
		System.out.println(new ClosestPointToOrigin().closestPoints(list, k));
		
	}

}
