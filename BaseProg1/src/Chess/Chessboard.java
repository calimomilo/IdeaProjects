package Chess;

import java.awt.*;

public class Chessboard {
    private int size = 8;
    private String color1 = Color.BLACK_BACKGROUND;
    private String color2 = Color.WHITE_BACKGROUND;

    private String[][] board = new String[size][size];

    public Chessboard() {
        emptyBoard();
    }

    public Chessboard(int size) {
        this.size = size;
        emptyBoard();
    }

    public Chessboard(String color1, String color2) {
        this.color1 = color1;
        this.color2 = color2;
        emptyBoard();
    }

    public Chessboard(int size, String color1, String color2) {
        this.size = size;
        this.color1 = color1;
        this.color2 = color2;
        emptyBoard();
    }

    public int getSize() {
        return size;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String[][] getBoard() {
        return board;
    }

    public void emptyBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = " ";
            }
        }
    }

    public String toString() {
        String s = "\t\t";
        for (int i = 0; i < size; i++) {
            s += " " + (char)(65+i) + "\t";
        }

        for (int i = 0; i < size; i++) {
            s += "\n   " + (8-i) + "\t";
            for (int j = 0; j < size; j++) {
                if ((i+j)%2 == 0) {
                    s += color1 + " " + board[i][j] + "\t" + Color.RESET;
                } else {
                    s += color2 + " " + board[i][j] + "\t" + Color.RESET;
                }
            }
            s += "\t" + (8-i);
        }
        s+= "\n\t\t";

        for (int i = 0; i < size; i++) {
            s += " " + (char)(65+i) + "\t";
        }

        return s;
    }

    public static void main(String[] args) {
        Chessboard chess = new Chessboard(Color.BLUE_BACKGROUND_BRIGHT, Color.GREEN_BACKGROUND_BRIGHT);
        System.out.println(chess);
    }
}
