class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            int[] count = new int[10];
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') continue;

                if (count[Character.getNumericValue(board[i][j])] > 0) {
                    return false;
                }

                count[Character.getNumericValue(board[i][j])]++;
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            int[] count = new int[10];
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') continue;
                if (count[Character.getNumericValue(board[i][j])] > 0) {
                    return false;
                }

                count[Character.getNumericValue(board[i][j])]++;
            }
        }
        
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkGrid(board, i, j)) return false;
            }
        }

        return true;
    }

    // check a 3x3 grid
    public boolean checkGrid (char[][] board, int a, int b) {
        int[] count = new int[10];
        for (int j = a; j < a + 3; j++) {
            for (int k = b; k < b + 3; k++) {
                if (board[j][k] == '.') continue;
                if (board[j][k] != '.' && count[Character.getNumericValue(board[j][k])] > 0) {
                    return false;
                }

                count[Character.getNumericValue(board[j][k])]++;
            }
        }

        return true;
    }
}
