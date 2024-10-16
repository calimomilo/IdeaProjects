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
public class S2ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Soit l'equation ax+b=0.\nVeuillez saisir la valeur de a : ");
        double a = scanner.nextDouble();
        
        System.out.println("Veuillez saisir la valeur de b : ");
        double b = scanner.nextDouble();
        
        String msg = (a != 0)
                ? "x = " + b/a + "."
                : (b == 0)
                ? "l'ensemble des reels."
                : "l'ensemble vide.";
        
        System.out.println("l'equation " + a + "x+" + b + " a comme solution " + msg);
    }
}
