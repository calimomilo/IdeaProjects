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

    public static void updateChessboard(char[][] board, char pion, String position) {
        char[] string = position.toCharArray();
        int posX = string[0]-65;
        int posY = 56-string[1];
        board[posY][posX] = pion;
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

    public static boolean checkPiece(char[][] board, String position, char blanc, char noir) {
        boolean isValid = false;

        char[] string = position.toCharArray();
        int posX = string[0]-65;
        int posY = 56-string[1];
        if (board[posY][posX] == blanc || board[posY][posX] == noir) {
            isValid = true;
        } else {
            System.out.println("\nCette case est déjà occupée\n");
        }
        return isValid;
    }

    public static boolean checkMove(String position1, String position2) {
        boolean isValid = false;

        char[] string1 = position1.toCharArray();
        char[] string2 = position2.toCharArray();
        int diffX = Math.abs(string1[0] - string2[0]);
        int diffY = Math.abs(string1[1] - string2[1]);

        if (diffX == 1) {
            isValid = diffY == 2;
        } else if (diffX == 2) {
            isValid = diffY == 1;
        }

        if(!isValid) {
            System.out.println("\nMouvement invalide\n");
        }
        return isValid;
    }

    public static String askPosition() {
        String position = "";
        boolean isValid = false;
        String error = "\nSaisie invalide ; format A1 ou a1\n";
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
        } while (!isValid);
        return position;
    }

    public static char[][] placePiece(char[][] board, char pion, String position) {
        char[][] boardTemp = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boardTemp[i][j] = board[i][j];
            }
        }
        updateChessboard(boardTemp, pion, position);
        return boardTemp;
    }

    public static char[][] placePiece(char[][] board, char pion, String position, char blanc, char noir) {
        if(checkPiece(board, position, blanc, noir)) {
            return placePiece(board, pion, position);
        } else {
            return board;
        }
    }

    public static boolean movePiece(char[][] board, char pion, String position1, String position2) {
        boolean isValid = checkMove(position1, position2);
        if (isValid) {
            printChessboard(placePiece(board, pion, position2));
        }
        return isValid;
    }

    public static char[][] playProbCavalier(char blanc, char noir, char pion) {
        char[][] board = createChessboard(blanc, noir);
        printChessboard(board);

        String currentPosition = askPosition();
        printChessboard(placePiece(board, pion, currentPosition));

        String nextPosition = "";
        int counter = 1;
        for (int i = 0; i < 100; i++) {
            nextPosition = askPosition();

            if (checkPiece(board, nextPosition, blanc, noir) && checkMove(nextPosition, currentPosition)) {
                updateChessboard(board, (char) (counter+49), currentPosition);
                printChessboard(placePiece(board, pion, nextPosition));
                currentPosition = nextPosition;
                counter++;
            }
        }


        return board;
    }

    public static void main(String[] args) {
        char BLANC = 'O';
        char NOIR = '#';
        char PION = '♙';
        char CAVALIER = '♘';

//        System.out.println("\nEXERCICE 1\n");
//        char[][] board1 = createChessboard(BLANC, NOIR);
//        printChessboard(board1);
//
//        System.out.println("\nEXERCICE 2\n");
//        // version non permanente
//        printChessboard(placePiece(board1, PION, "C2"));
//        printChessboard(board1);
//
//        // version permanente
//        updateChessboard(board1, PION, "C7");
//        printChessboard(board1);
//
//        System.out.println("\nEXERCICE 3\n");
//        char [][] board2 = createChessboard(BLANC, NOIR);
//        printChessboard(placePiece(board2, CAVALIER, "C1", BLANC, NOIR));
//        printChessboard(placePiece(board1, CAVALIER, "C7", BLANC, NOIR));
//
//        movePiece(board2, CAVALIER, "C1", "D3");

        System.out.println("\nEXERCICE 4\n");
        playProbCavalier(BLANC, NOIR, CAVALIER);
    }
}
