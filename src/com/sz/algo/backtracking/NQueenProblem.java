package com.sz.algo.backtracking;

public class NQueenProblem {

	private static int N = 4;

	public static void main(String[] args) {

		int[][] board = new int[4][4];

//		for(int [] arr : board) 
//			Arrays.fill(arr, 1);

		// Start column wise
		
		System.out.println(solveNQ(board, 0));

	}

	private static boolean solveNQ(int[][] board, int col) {

		if (col >= N) {
			return true;
		}

		for (int i = 0; i < N; i++) {

			if (isSafe(board, i, col)) {

				board[i][col] = 1;

				// Solve NQ from next column
				if (solveNQ(board, col + 1)) {
					return true;
				}
				// backtrack if this move does not solve remaining board
				board[i][col] = 0; // backtrack

			}

		}
		return false;

	}

	private static boolean isSafe(int[][] board, int row, int col) {

		// Check this row on left size
		// Right side not needed because we havn't changed anything on the right side
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1)
				return false;
		}

		// Check upper diagonal on left side
		// Upper right not needed

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

			if (board[i][j] == 1)
				return false;

		}

		// Check lower diagonal on left side

		for (int i = row + 1, j = col - 1; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}

		return true;

	}

}
