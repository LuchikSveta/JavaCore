package JavaCore_Final;

public class ChessBoard {
    private final String[][] board;

    public ChessBoard() {
        this.board = new String[][]{
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"}
        };
    }

    void setShip(int x, int y) {
        this.board[x][y] = "\uD83D\uDEE5";
    }

    void setHalo(int x, int y) {
        this.board[x][y] = "\uD83D\uDFE6";
    }

    void killShip(int x, int y) { this.board[x][y] = "\uD83D\uDFE5"; }

    String getShip(int x, int y) { return this.board[x][y]; }

    void print() {
        for (String[] i : this.board) {
            for (String j : i) {
                System.out.printf("%5s", j);
            }
            System.out.println();
        }
    }
}
