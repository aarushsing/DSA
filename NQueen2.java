package Backtracking.Day_11;

public class NQueen2 {

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        placeQueens(board, 0, n);
    }

    private static void placeQueens(int[][] board, int col, int n) {
        if (col == n) {
            printBoard(board, n);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                placeQueens(board, col + 1, n);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check if there is a queen in the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board, int n) {
        boolean printed = false; // Flag to keep track of whether board has been printed
        if (!printed) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            printed = true; // Set the flag to true after printing the board
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this value to the desired board size
        solveNQueens(n);
    }
}
