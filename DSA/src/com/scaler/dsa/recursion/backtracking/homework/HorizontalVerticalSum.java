package com.scaler.dsa.recursion.backtracking.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class HorizontalVerticalSum {
	
	private int poosibleAns(int ops, ArrayList<ArrayList<Integer>> grid, int allowed){
        if(ops == -1){
            return 0;
        }

        int res=1;
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid.get(0).size(); j++){
                int sum = 0;
                for(int k=j; k<grid.get(0).size(); k++){
                    sum += grid.get(i).get(k);

                    if(sum > allowed){
                        res = 0;
                        for(int l=j; l<=k; l++){
                            grid.get(i).set(l, -1 * grid.get(i).get(l));
                            res |= poosibleAns(ops-1, grid, allowed);
                            grid.get(i).set(l, -1 * grid.get(i).get(l));
                        }
                        return res;
                    }
                }
            }
        }

        for(int j=0; j<grid.get(0).size(); j++){
            for(int i=0; i<grid.size(); i++){
                int sum=0;

                for(int k=i; k<grid.size(); k++){
                        sum += grid.get(k).get(j);
                        if(sum > allowed){
                            res = 0;
                            for(int l=i; l<=k; l++){
                                grid.get(l).set(j, -1 * grid.get(l).get(j));
                                res |= poosibleAns(ops-1, grid, allowed);
                                grid.get(l).set(j, -1 * grid.get(l).get(j));
                            }
                            return res;
                        }
                }
            }

        }

        return res;
    }

    public int solve(int ops, ArrayList<ArrayList<Integer>> grid, int allowed) {
        return poosibleAns(ops, grid, allowed);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HorizontalVerticalSum obj = new HorizontalVerticalSum();
		
		int ops = 5;
		ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
		grid.add(new ArrayList<>(Arrays.asList(-7, -3, -6, -2)));
		grid.add(new ArrayList<>(Arrays.asList(-10, -3, 5, -4)));
		grid.add(new ArrayList<>(Arrays.asList(-6, -4, 7, -4)));
		int allowed = 7;
		
		System.out.println(obj.solve(ops, grid, allowed));
	}

}
