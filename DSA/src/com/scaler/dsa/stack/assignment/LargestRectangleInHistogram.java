package com.scaler.dsa.stack.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class LargestRectangleInHistogram {
	
	public int largestRectangleArea(ArrayList<Integer> heights) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int length = heights.size();
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            while ((stack.peek() != -1)
                    && (heights.get(stack.peek()) >= heights.get(i))) {
                int currentHeight = heights.get(stack.pop());
                int currentWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int currentHeight = heights.get(stack.pop());
            int currentWidth = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        return maxArea;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LargestRectangleInHistogram().largestRectangleArea(new ArrayList<>(Arrays.asList(6, 7, 5, 2, 4, 5, 9, 3))));
		
		System.out.println(new LargestRectangleInHistogram().largestRectangleArea(new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3))));
	}

}
