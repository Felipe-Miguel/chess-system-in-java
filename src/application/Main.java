package application;

import BoardGame.Board;
import BoardGame.Position;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMath = new ChessMatch();
        UI.printBoard(chessMath.getPieces());

    }
}