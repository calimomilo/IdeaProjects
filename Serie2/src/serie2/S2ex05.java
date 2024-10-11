/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie2;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class S2ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre : ");
        double no = scanner.nextDouble();
                
        String msg = (no < 0)
                ? "negatif." 
                : ((no == 0)
                ? "nul." 
                : "positif.");
        System.out.println("Votre nombre est " + msg);
    }
    
}
