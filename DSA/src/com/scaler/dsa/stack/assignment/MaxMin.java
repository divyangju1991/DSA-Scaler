package com.scaler.dsa.stack.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class MaxMin {
	
	long modulo = 1000000007;

	  public int solve(ArrayList<Integer> list) {

	      

	      int[] nearestSmallerIndexOnRight = getNearestSmallerIndexOnRight(list);

	      int[] nearestSmallerIndexOnLeft = getNearestSmallerIndexOnLeft(list);

	      

	      int[] nearestLargerIndexOnRight = getNearestLargerIndexOnRight(list);

	      int[] nearestLargerIndexOnLeft = getNearestLargerIndexOnLeft(list);

	      

	      int sumOfDifferences = 0;

	      

	      for(int i = 0; i < list.size(); i++) {

	      

	          // for element list.get(i) , 

	          long min = (((nearestSmallerIndexOnRight[i] - i) + modulo)  % modulo) * ((( i - nearestSmallerIndexOnLeft[i]) + modulo)  % modulo) * list.get(i) % modulo ;  // contributes by being the min

	          long max = (((nearestLargerIndexOnRight[i] - i) + modulo)  % modulo) * ((( i - nearestLargerIndexOnLeft[i]) + modulo)  % modulo)* list.get(i) % modulo; // contributes by being the max

	          int difference = (int) (max - min);

	          sumOfDifferences = (int) ((((difference + modulo)  % modulo) + (sumOfDifferences % modulo)) % modulo);

	          

	      }

	      return sumOfDifferences;

	      

	  }

	  

	  private int[] getNearestSmallerIndexOnRight(ArrayList<Integer> list) {

	      Stack<Integer> prevElements = new Stack<Integer>();

	      int[] nearestSmallerOnRight =  new int[list.size()];

	      for(int i = list.size() - 1; i >= 0; i--) {

	          while(!prevElements.empty() && list.get(prevElements.peek()) >= list.get(i)) {

	              prevElements.pop();

	          }

	          nearestSmallerOnRight[i] = (prevElements.empty()) ? list.size() : prevElements.peek();

	          prevElements.push(i);

	      }

	      return nearestSmallerOnRight; 

	  }

	  

	   private int[] getNearestLargerIndexOnRight(ArrayList<Integer> list) {

	      Stack<Integer> prevElements = new Stack<Integer>();

	      int[] nearestLargerOnRight =  new int[list.size()];

	      for(int i = list.size() - 1; i >= 0; i--) {

	          while(!prevElements.empty() && list.get(prevElements.peek()) <= list.get(i)) {

	              prevElements.pop();

	          }

	          nearestLargerOnRight[i] = (prevElements.empty()) ? list.size() : prevElements.peek();

	          prevElements.push(i);

	      }

	      return nearestLargerOnRight; 

	  }

	  

	  private int[] getNearestSmallerIndexOnLeft(ArrayList<Integer> list) {

	      Stack<Integer> prevElements = new Stack<Integer>();

	      int[] nearestSmallerOnLeft =  new int[list.size()];

	      for(int i = 0; i < list.size(); i++) {

	          while(!prevElements.empty() && list.get(prevElements.peek()) >= list.get(i)) {

	              prevElements.pop();

	          }

	          nearestSmallerOnLeft[i] = (prevElements.empty()) ? -1 : prevElements.peek();

	          prevElements.push(i);

	      }

	      return nearestSmallerOnLeft; 

	  }

	  

	  private int[] getNearestLargerIndexOnLeft(ArrayList<Integer> list) {

	      Stack<Integer> prevElements = new Stack<Integer>();

	      int[] nearestLargerOnLeft =  new int[list.size()];

	      for(int i = 0; i < list.size(); i++) {

	          while(!prevElements.empty() && list.get(prevElements.peek()) <= list.get(i)) {

	              prevElements.pop();

	          }

	          nearestLargerOnLeft[i] = (prevElements.empty()) ? -1 : prevElements.peek();

	          prevElements.push(i);

	      }

	      return nearestLargerOnLeft; 


	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
