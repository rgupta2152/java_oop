public class q25 {
    public static void main(String[] args) {
        String[][] board = new String[8][8]; // create 8 x 8 board
        boolean result = stillRed(board);
        System.out.println(result);
    }

    public static boolean stillRed(String[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] != null && board[r][c].equals("red")) {
                    return true;
                }
            }
        }
        return false;
    }
}
