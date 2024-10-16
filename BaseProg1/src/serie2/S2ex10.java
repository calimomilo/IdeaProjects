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
public class S2ex10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Combien de pieces voulez-vous acheter ?");
        short quantite = scanner.nextShort();
        
        System.out.println("Quel est le prix unitaire de la piece ?");
        double prixPiece = scanner.nextDouble();
                
        byte rabais = (quantite >= 1000)
                ? 10
                : (quantite >= 100)
                ? 5
                : (quantite >= 50)
                ? 3
                : (byte)0;
        
        double tva = (quantite <= 250)
                ? 8.2
                : (quantite <= 500)
                ? 6.3
                : 4.5;
        
        double prixHT = prixPiece*quantite*((100-rabais)/100.0);
        double prixTTC = prixHT*(100+tva)/100;
        double prixFinalArrondi = Math.round(prixTTC*10)/10.0;
        
        System.out.println(prixHT + ", " + prixTTC + ", " + prixFinalArrondi);
        
        System.out.print("Le prix TTC pour " + quantite + " pieces a " + prixPiece 
                + ".- avec un rabais de " + rabais + "% et un taux TVA a " 
                + tva + "% sera de : ");
        System.out.printf("%.2f.-", prixFinalArrondi);
    }
    
}
