package com.bridgelabz.TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {
    char[] board;

    {
        board = new char[10]; //Created a board of char[] of size 10
    }
public void createBoard() {   //Initialized createBoard method
    int i;
    for(i=1; i<board.length; i++){
            board[i]=' ';
        }
}
public void turn() {
        System.out.println("Enter your choice X or O: ");
        Scanner sc = new Scanner(System.in);
    char player = sc.next().charAt(0);
    char computer= ' ';
        if(player == 'X') {
            computer = '0';
        }
        else if (player == '0'){
            computer = 'X';
        }
        else{
            System.out.println("Please choose a valid option");
        }
        System.out.println("Player Chose: " +player);
        System.out.println("Computer gets: " +computer);
}
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game");
        //Created Class Object
        TicTacToeGame T = new TicTacToeGame();
        T.createBoard();
        System.out.println("Board is Initialized");
        T.turn();
    }
}
