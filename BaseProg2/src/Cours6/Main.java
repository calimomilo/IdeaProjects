package Cours6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/testfile.txt"));
            String line = br.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, " + e.getMessage());
            // e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception, " + e.getMessage());
            // e.printStackTrace();
        }
    }
}

