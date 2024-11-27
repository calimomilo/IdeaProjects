package serie5b;

import ch.comem.Clavier;

public class S5bEx02 {

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

    public static boolean checkPosition(String position) {
        boolean isValid = false;
        String error = "\nSaisie invalide ; format A1 ou a1\n";

        if (position.length() != 2) {
            System.out.println(error);
        } else {
            char[] string = position.toCharArray();
            char a = string[0];
            char b = string[1];

            if (b >= '1' && b <= '8') {
                if (a >= 'A' && a <= 'H') {
                    isValid = true;
                } else if (a >= 'a' && a <= 'h') {
                    a -= 32;
                    position = ""+ a + b;
                    isValid = true;
                } else {
                    System.out.println(error);
                }
            } else {
                System.out.println(error);
            }
        }
        return isValid;
    }

    public static String askPosition() {
        String position = "";
        boolean isValid = false;
        do {
            position = Clavier.rend_String("Où placez-vous votre pion ? ");
            isValid = checkPosition(position);
        } while (!isValid);
        return position;
    }

    public static char[][] updateChessboard(char[][] board, char pion, String position) {
        if (checkPosition(position)) {
            char[] string = position.toCharArray();
            int posX = string[0]-65;
            int posY = 56-string[1];
            board[posY][posX] = pion;
        }
        return board;
    }

    public static void main(String[] args) {
        char BLANC = 'O';
        char NOIR = '#';
        char PION = '♙';

        printChessboard(createChessboard(BLANC, NOIR));
    }
}
