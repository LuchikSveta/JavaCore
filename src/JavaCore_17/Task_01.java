package JavaCore_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
        List<ChessPiece> chess = new ArrayList<>(Arrays.asList(
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK));
        for (ChessPiece s : chess) {
            System.out.print(s.getFigure());
        }
    }
}
