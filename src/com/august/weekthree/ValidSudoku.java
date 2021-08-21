package com.august.weekthree;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(isValidSudoku(board));
	}

	private static boolean isValidSudoku(char[][] board) {

		Set<String> data = new HashSet<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				char current_val = board[i][j];
				if (current_val != '.') {
					if ((!data.add(current_val + "found at row-" + i))
							|| (!data.add(current_val + "found at column-" + j))
							|| (!data.add(current_val + "found at bock" + i / 3 + "-" + j / 3))) {
						return false;
					}
				}
			}
		}

		return true;
	}

	/*
	 * public static boolean isValidSudoku(char[][] board) {
	 * 
	 * boolean result = true;
	 */

	/*
	 * // first validate rows for the duplicate. for (int i = 0; i < board.length;
	 * i++) { Set<Character> temp = new HashSet<Character>(); for (int j = 0; j <
	 * board[0].length; j++) { if (board[i][j] != '.') { if (temp.add(board[i][j])
	 * == false) { return false; } } } } // then validate all the columns one by one
	 * for (int i = 0; i < board[0].length; i++) { Set<Character> temp = new
	 * HashSet<>(); for (int j = 0; j < board.length; j++) { if (board[j][i] != '.')
	 * { if (temp.add(board[j][i]) == false) { return false; } } } } // check for
	 * the 3X3 block.
	 * 
	 * int i = 0, j = 0; while (i < 9 && j < 9) { while (i < 9) { if (!validBoard(i,
	 * j, board)) return false; i = i + 3; } i = 0; j = j + 3; }
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * private static boolean validBoard(int row, int col, char[][] board) { //
	 * valid from current i-th block to next 3X3 Set<Character> temp = new
	 * HashSet<>(); for (int i = row; i < row + 3; i++) { for (int j = col; j < col
	 * + 3; j++) { if (board[i][j] != '.') { // System.out.println(board[i][j] +
	 * " "); if (temp.add(board[i][j]) == false) { return false; } } } } return
	 * true; }
	 */

}
