/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie1;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Serie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quel est ton poids ?");
        
        Scanner scanner = new Scanner(System.in);
        double poids = scanner.nextDouble();
        
        // double no = 20.2;
        
        System.out.println("Ton poids : " + poids);
    }
    
}
