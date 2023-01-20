class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int k = 0;
        boolean[][] tracker = new boolean[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(k)) {
                    if (isWordExists(i, j, word, board, k + 1, tracker))
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWordExists(int r, int c, String word, char[][] board, int k, boolean[][] tracker) {
        if (k == word.length()) return true;
        tracker[r][c] = true;
        char ch = word.charAt(k);
        boolean result = false;
        if (r + 1 < board.length && board[r + 1][c] == ch && !tracker[r + 1][c])
            result = result | isWordExists(r + 1, c, word, board, k + 1, tracker);

        if (c + 1 < board[0].length && board[r][c + 1] == ch && !tracker[r][c + 1])
            result = result | isWordExists(r, c + 1, word, board, k + 1, tracker);

        if (r - 1 > -1 && board[r - 1][c] == ch && !tracker[r - 1][c])
            result = result | isWordExists(r - 1, c, word, board, k + 1, tracker);

        if (c - 1 > -1 && board[r][c - 1] == ch && !tracker[r][c - 1])
            result = result | isWordExists(r, c - 1, word, board, k + 1, tracker);
        
        if (result == false) tracker[r][c] = false;
        return result;
    }
    }