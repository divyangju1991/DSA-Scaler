package com.scaler.dsa.recursion.backtracking.assignment;

import java.util.ArrayList;

public class Sudoku {
	
	 private boolean isValid(ArrayList<ArrayList<Character>> board, int row, int col, char ch){
			
	        int rowSize = board.size();

			for(int i=0; i<rowSize;i++){
				
				if(board.get(i).get(col) == ch){
					return false;
				}
				
				if(board.get(row).get(i) == ch){
					return false;
				}
				
	            int blockSize = (int) Math.sqrt(rowSize); 
	            int stratIndex = i/3;
	            int remainIndex = i%3;
				//board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c
	            //stratIndex = i/3
	            //(u+(i/3), (v+(i/3)))
				if(board.get(blockSize * (row / blockSize) + stratIndex).get(blockSize * (col / blockSize) + remainIndex) == ch){
					return false;
				}
			}
			return true;
		}
		
		
		private boolean solveSudokuProblem(ArrayList<ArrayList<Character>> board) {
			
	        int rowSize = board.size();
	        int colSize = board.get(0).size();

			for (int i = 0; i < rowSize; i++) {
			      for (int j = 0; j < colSize; j++) {
			        if (board.get(i).get(j) == '.') {

			          for (char c = Character.forDigit(1,10); c <= Character.forDigit(rowSize,10); c++) {
			            if (isValid(board, i, j, c)) {
			              board.get(i).set(j, c);

			              if (solveSudokuProblem(board)) {
			            	  return true;
			              }
			                
			              else
			                board.get(i).set(j, '.');
			            }
			          }

			          return false;
			        }
			    }
			}
			    return true;
		}
		

		public void solveSudoku(ArrayList<ArrayList<Character>> a) {
	        solveSudokuProblem(a);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Character>> sudokuChars = new ArrayList<>();
		new Sudoku().solveSudoku(sudokuChars);
		
	}

}
