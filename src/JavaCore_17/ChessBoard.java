package JavaCore_17;

import java.util.List;

public class ChessBoard {
    private final List<List<ChessPiece>> board;

    public ChessBoard(List<List<ChessPiece>> board) {
        this.board = board;
    }

    void print() {
        for (List<ChessPiece> i : this.board) {
            for (ChessPiece j : i) {
                System.out.print(j.getFigure());
            }
            System.out.println();
        }
    }
}
