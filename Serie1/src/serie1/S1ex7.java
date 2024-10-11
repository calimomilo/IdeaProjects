/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie1;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class S1ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Largeur : ");
        double largeur = scanner.nextDouble();
        
        System.out.print("\nLongueur : ");
        double longueur = scanner.nextDouble();
        
        System.out.print("\nHauteur : ");
        double hauteur = scanner.nextDouble();
        
        double surface = largeur * longueur;
        double murs = 2 * (largeur + longueur) * hauteur;
        
        System.out.println("Surface du sol : " + surface +
                "\nSurface des murs : " + murs);
    }
    
}
