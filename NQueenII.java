//N-Queens problem II
//https://leetcode.com/problems/n-queens-ii/

import java.util.*;

class NQueenII {
    public void saveboard(char board[][], List<List<String>> allBoard) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            list.add(row);
        }
        allBoard.add(list);
    }

    public boolean issafe(char board[][], int row, int col) {
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void nqueen(List<List<String>> allBoard, char board[][], int col) {
        if (col == board.length) {
            saveboard(board, allBoard);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (issafe(board, i, col)) {
                board[i][col] = 'Q';
                nqueen(allBoard, board, col + 1);
                board[i][col] = '.';
            }
        }
    }

    public int totalNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nqueen(allBoard, board, 0);
        return allBoard.size();
    }
    public static void main(String[] args) {
        NQueenII nQueenII = new NQueenII();
        int n = 8; // Example for 8-Queens problem
        int result = nQueenII.totalNQueens(n);
        System.out.println("Total solutions for " + n + "-Queens: " + result);
    }


}