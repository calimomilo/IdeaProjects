package serie6;

import java.util.Arrays;
import java.util.Random;

public class charlie {
    public static void populateRandom(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                Random rand = new Random();
                tab[i][j] = (char)(rand.nextInt(26) + 'A');
            }
        }
    }

    public static void populateChar(char[][] tab, char ch) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = ch;
            }
        }
    }

    public static void placeString(char[][] tab, String str) {
        char[] chars = str.toUpperCase().toCharArray();
        if (chars.length > tab.length || chars.length > tab[0].length) {
            System.out.println("Ce mot est trop long !");
        } else {
            Random rand = new Random();
            int x = rand.nextInt(tab.length-chars.length+1);
            int y = rand.nextInt(tab[0].length-chars.length+1);
            int d = rand.nextInt(3);

            for (int c = 0; c < chars.length; c++) {
                switch (d) {
                    case 0: tab[x+c][y] = chars[c]; break;
                    case 1: tab[x][y+c] = chars[c]; break;
                    case 2: tab[x+c][y+c] = chars[c]; break;
                }
            }
        }
    }

    public static void printChars(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] tab = new char[10][10];
        populateRandom(tab);
        placeString(tab, "charlie");
        printChars(tab);

//        for (int i = 0; i < 10; i++) {
//            char[][] tab2 = new char[10][10];
//            populateChar(tab2, 'o');
//            placeString(tab2, "charlie");
//            System.out.println("\n");
//            printChars(tab2);
//        }
    }

}
