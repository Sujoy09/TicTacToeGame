package com.bridgelabz.TicTacToeGame;

public class TicTacToeGame {
    char[] board;

    {
        board = new char[10];
    }
public void createBoard() {
    int i;
    for(i=1; i<board.length; i++){
            board[i]=' ';
        }
}

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        TicTacToeGame T = new TicTacToeGame();
        T.createBoard();
    }
}
