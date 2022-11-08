package com.scaler.dsa.queue.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class TaskScheduling {
	
public void insertAllTasks(ArrayList<Integer> A, Deque < Integer > taskQueue){
        
        int n = A.size();

        for(int i=0; i<n; i++){
            taskQueue.addLast(A.get(i));
        }
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
         Deque < Integer > taskQueue = new ArrayDeque < Integer > ();
         insertAllTasks(A, taskQueue);

        int n = B.size();
        int ans = 0;

        for(int i=0; i<n; i++){
            
            while(taskQueue.getFirst().intValue() != B.get(i).intValue()){
                int tmp = taskQueue.getFirst();
                taskQueue.removeFirst();
                taskQueue.addLast(tmp);
                ++ans;
            }

            taskQueue.removeFirst();
            ++ans;
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new TaskScheduling().solve(new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4)), new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2))));
		System.out.println(new TaskScheduling().solve(new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1))));
	}

}
