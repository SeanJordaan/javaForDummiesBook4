/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
import java.util.Scanner;

public class KnightMoves {

    static Scanner sc = new Scanner(System.in);
    // the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {{-2, +1}, //This line declares a two-dimensional array that’s used to store the 
                                      //possible moves for a knight in terms of x and y
    {-1, +2},
    {+1, +2},
    {+2, +1},
    {+2, -1},
    {+1, -2},
    {-1, -2},
    {-2, -1}};

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Knight Move calculator.\n");
        do {
            showKnightMoves(); // Showing moves is doing the calculations in that method(Line 38), 
                               //on this line the scanner is only getting the input from theuser
        } while (getYorN("Do it again?"));
    }

    public static void showKnightMoves()// The showNightMoves method begins here and ends on line 73
    {
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8]; //   The board array represents the chessboard as a two-dimensional array
                                       // A value of 0 indicates that the square is empty. The 
                                       // square where the knight resides gets a 1, and any square that the 
                                       // knight can move to gets a 2.
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        // get the knight's initial position
        do // This do loop prompts the user for a valid square to plant the knight in.
            //and convertes the input into the possition on the chestboard using the Pos method on line 81 
            //and if the enterd value is incorect the loop runs again because it cant place the knight 
        {
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);
        board[kPos.x][kPos.y] = 1;// The board position entered by the user is set to 1 to indicate the 
                                 //position of the knight
        System.out.println("\nThe knight is at square "
                + convertPosToSquare(kPos));
        System.out.println(
                "From here the knight can move to:");
        for (int move = 0; move < moves.length; move++) //  A for loop is used to test all the possible moves for the knight to see 
                                                        // whether they’re valid from the knight’s current position
                                                        // in the body of the loop line 81 is called(it calls iy on line 74)
        {
            int x, y;
            x = moves[move][0]; // the x for this move
            y = moves[move][1]; // the y for this move
            Pos p = calculateNewPos(kPos, x, y);
            if (p != null) {
                System.out.println(convertPosToSquare(p));
                board[p.x][p.y] = 2;
            }
        }
        printBoard(board); //→72
    }
    // this method converts squares such as a1 or d5 to
    // x, y coordinates such as [0][0] or [3][4]

    public static Pos convertSquareToPos(String square) //This is the convertSquareToPos method. It uses a pair of brute-force if 
                                                        //statements to convert a string such as a1 or e4 to a Pos object
                                                        //representing the same position.
    {
        int x = -1;
        int y = -1;
        char rank, file;
        file = square.charAt(0);
        if (file == 'a') {
            x = 0;
        }
        if (file == 'b') {
            x = 1;
        }
        if (file == 'c') {
            x = 2;
        }
        if (file == 'd') {
            x = 3;
        }
        if (file == 'e') {
            x = 4;
        }
        if (file == 'f') {
            x = 5;
        }
        if (file == 'g') {
            x = 6;
        }
        if (file == 'h') {
            x = 7;
        }
        rank = square.charAt(1);
        if (rank == '1') {
            y = 0;
        }
        if (rank == '2') {
            y = 1;
        }
        if (rank == '3') {
            y = 2;
        }
        if (rank == '4') {
            y = 3;
        }
        if (rank == '5') {
            y = 4;
        }
        if (rank == '6') {
            y = 5;
        }
        if (rank == '7') {
            y = 6;
        }
        if (rank == '8') {
            y = 7;
        }
        if (x == -1 || y == -1) {
            return null;
        } else {
            return new Pos(x, y);
        }
    }
    // this method converts x, y coordinates such as
    // [0][0] or [3][4] to squares such as a1 or d5.

    public static String convertPosToSquare(Pos p) //This is the convertPosToSquare method, which does the opposite of 
                                                   //the convertSquareToPos method. It accepts a Pos argument and 
                                                   //returns a string that corresponds to the position.
    {
        String file = "";
        if (p.x == 0) {
            file = "a";
        }
        if (p.x == 1) {
            file = "b";
        }
        if (p.x == 2) {
            file = "c";
        }
        if (p.x == 3) {
            file = "d";
        }
        if (p.x == 4) {
            file = "e";
        }
        if (p.x == 5) {
            file = "f";
        }
        if (p.x == 6) {
            file = "g";
        }
        if (p.x == 7) {
            file = "h";
        }
        return file + (p.y + 1);
    }
// this method calculates a new Pos given a
// starting Pos, an x move, and a y move
    // it returns null if the resulting move would
    // be off the board.

    public static Pos calculateNewPos(Pos p, int x, int y) //The calculateNewPos method accepts a starting position, an x offset, 
                                                           //and a y offset. It returns a new position if the move is legal;
    {
        // rule out legal moves
        if (p.x + x < 0) {
            return null;
        }
        if (p.x + x > 7) {
            return null;
        }
        if (p.y + y < 0) {
            return null;
        }
        if (p.y + y > 7) {
            return null;
        }
// return new position
        return new Pos(p.x + x, p.y + y);
    }

    public static void printBoard(int[][] b) //The printBoard method uses a nested for loop to print the board. The 
                                             //outer loop prints each rank.
    {
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                if (b[x][y] == 1) {
                    System.out.print(" X ");
                } else if (b[x][y] == 2) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static boolean getYorN(String prompt)// The getYorN method simply displays a prompt on-screen and asks the 
                                               //user to enter Y or N. if the user enteres anything els then the method prompts again. 
    {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
// this class represents x, y coordinates on the board

class Pos//  The Pos class simply defines two public fields, x and y, to keep track of 
         //board positions.
{

    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
