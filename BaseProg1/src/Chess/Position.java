package Chess;

public class Position {
    private Chessboard chessboard;
    private int row;
    private int col;

    public Position(Chessboard chessboard, String pos) {
        this.chessboard = chessboard;
    }

    public Chessboard getChessboard() {
        return chessboard;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean setPosition(String pos) {
        boolean success = false;
        char[] string = pos.toCharArray();
        char a = string[0];
        char b = string[1];

        if (pos.length() == 2) {
            if (b >= '1' && b <= this.chessboard.getSize()) {
                if (a >= 'A' && a <= (char)('A'+this.chessboard.getSize()-1)) {
                    success = true;
                } else if (a >= 'a' && a <= (char)('h'+this.chessboard.getSize()-1)) {
                    a -= 32;
                    success = true;
                }
            }
        }

        if (success) {
            this.row = 56-b;
            this.col = (int) a-65;
        }
        return success;
    }
}
