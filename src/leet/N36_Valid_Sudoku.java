package leet;

import java.util.HashSet;
import java.util.Set;

public class N36_Valid_Sudoku {
    public static void main(String[] args) {
        System.out.println(new N36_Valid_Sudoku().isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));

        System.out.println(new N36_Valid_Sudoku().isValidSudoku(new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));

    }

    public boolean isValidSudoku(char[][] board) {
        Set<Character> temp = new HashSet<>();

        return checkRowAndColumn(board) && checkBox(board, temp);
    }

    private static boolean checkBox(char[][] board, Set<Character> temp) {
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                for (int r = i; r < 3 + i; r++) {
                    for (int c = j; c < 3 + j; c++) {
                        if (board[r][c] != '.') {
                            if (!temp.add(board[r][c])) {
                                return false;
                            }
                        }
                    }
                }
                temp.clear();
            }
        }

        return true;
    }

    private static boolean checkRowAndColumn(char[][] board) {
        Set<Character> tempRow = new HashSet<>();
        Set<Character> tempColumn = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[j][i] != '.') {
                    if (!tempColumn.add(board[j][i])) {
                        return false;
                    }
                }

                if (board[i][j] != '.') {
                    if (!tempRow.add(board[i][j])) {
                        return false;
                    }
                }
            }
            tempRow.clear();
            tempColumn.clear();
        }
        return true;
    }

    private static boolean checkColumn(char[][] board, Set<Character> temp) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (!temp.add(board[j][i])) {
                        return false;
                    }
                }
            }
            temp.clear();
        }
        return true;
    }

    private static boolean checkRow(char[][] board, Set<Character> temp) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!temp.add(board[i][j])) {
                        return false;
                    }
                }
            }
            temp.clear();
        }
        return true;
    }
}
