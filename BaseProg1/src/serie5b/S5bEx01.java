package serie5b;

import ch.comem.Clavier;

import java.util.Arrays;

public class S5bEx01 {

    public static char[][] createChessboard(char blanc, char noir) {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2 == 0) {
                    board[i][j] = blanc;
                } else {
                    board[i][j] = noir;
                }
            }
        }
        return board;
    }

    public static char[][] createChessboard(char blanc, char noir, char pion, int posX, int posY) {
        char[][] board = createChessboard(blanc, noir);
        board[posY][posX] = pion;
        return board;
    }

    public static char[][] updateChessboard(char[][] board, char pion, int posX, int posY) {
        board[posY][posX] = pion;
        return board;
    }

    public static char[][] updateChessboard(char[][] board, char pion, String position) {
        char[] string = position.toCharArray();
        int posX = string[0]-65;
        int posY = 56-string[1];
        return updateChessboard(board, pion, posX, posY);
    }

    public static void printChessboard(char[][] board) {
        System.out.println("\t\tA\tB\tC\tD\tE\tF\tG\tH\n");
        for (int i = 0; i < 8; i++) {
            System.out.print((8-i) + "\t\t");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("\t" + (8-i));
        }
        System.out.println("\n\t\tA\tB\tC\tD\tE\tF\tG\tH\n");
    }

    public static void printChessboard(char blanc, char noir) {
        char[][] board = createChessboard(blanc, noir);
        printChessboard(board);
    }

    public static void printChessboard(char[][] board, char pion, int posX, int posY) {
        printChessboard(updateChessboard(board, pion, posX, posY));
    }

    public static void printChessboard(char blanc, char noir, char pion, int posX, int posY) {
        char[][] board = createChessboard(blanc, noir, pion, posX, posY);
        printChessboard(board);
    }

    public static void printChessboard(char[][] board, char pion, String position) {
        printChessboard(updateChessboard(board, pion, position));
    }

    public static String askPosition() {
        String position = "";
        String error = "\nSaisie invalide ; format A1 ou a1\n";
        boolean isNotValid = true;

        do {
            position = Clavier.rend_String("Où placez-vous votre pion ? ");
            if (position.length() != 2) {
                System.out.println(error);
            } else {
                char[] string = position.toCharArray();
                char a = string[0];
                char b = string[1];

                if (b >= '1' && b <= '8') {
                    if (a >= 'A' && a <= 'H') {
                        isNotValid = false;
                    } else if (a >= 'a' && a <= 'h') {
                        a -= 32;
                        position = ""+ a + b;
                        isNotValid = false;
                    } else {
                        System.out.println(error);
                    }
                } else {
                    System.out.println(error);
                }
            }
        } while (isNotValid);
        System.out.println();
        return position;
    }

    public static char[][] placePiece(char[][] board, char pion) {
        String position = askPosition();
        updateChessboard(board, pion, position);
        return board;
    }

    public static char[][] placePiece(char[][] board, char pion, char blanc, char noir) {
        String position = askPosition();

        char[] string = position.toCharArray();
        int posX = string[0]-65;
        int posY = 56-string[1];

        if (board[posY][posX] != blanc && board[posY][posX] != noir) {
            System.out.println("Il y a déjà une pièce sur cette case !\n");
        } else {
            updateChessboard(board, pion, position);
        }
        return board;
    }

    public static void main(String[] args) {
        char BLANC = 'O';
        char NOIR = '#';
        char PION = '♙';

        char[][] board1 = createChessboard(BLANC, NOIR);
        printChessboard(board1);

        while (true) {
            printChessboard(placePiece(board1, PION, BLANC, NOIR));
        }
    }
}
