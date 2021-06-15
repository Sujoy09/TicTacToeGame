package com.bridgelabz.TicTacToeGame;

import java.util.Arrays;
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
public static void showBoard(char[] board) {
    System.out.println("\n" + board[1] + " | " + board[2] + " | " + board[3]);
    System.out.println("------------");
    System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
    System.out.println("------------");
    System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
}
    public void move(char player) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select the index to make move :");
        int numMove = in.nextInt();
        if (numMove < 0 && numMove > 9) {
            System.out.println("Invalid try");
        } else {
            if (board[numMove] == ' ') {
                board[numMove] = player;
            } else {
                System.out.println("Index is not empty,try other index");
            }
        }

    }
    private static char checkChoice(Scanner userchoice) {
        System.out.println("Choose your choice :");
        return userchoice.next().toUpperCase().charAt(0);
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
            turn();
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
        showBoard(T.board);
        T.move();
        showBoard(T.board);

    }
}
