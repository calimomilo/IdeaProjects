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
public class S2ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir le jour : ");
        byte jour = scanner.nextByte();
        
        System.out.print("Veuillez saisir le mois : ");
        byte mois = scanner.nextByte();
        
        System.out.print("Veuillez saisir l'annee : ");
        short annee = scanner.nextShort();
        
        boolean isBissextile = (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;
        // System.out.println(isBissextile);
        
        boolean isValide = false;
        
        if(mois <= 0 || mois > 12 || jour <= 0 || jour > 31) {
            
        } else {
            switch(mois) {
                case 2 : 
                    if(isBissextile) {
                        if(jour <= 29) {
                            isValide = true;
                        };
                    } else {
                        if(jour <= 28) {
                            isValide = true;
                        }
                    }; break;
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    if(jour <= 30) {
                        isValide = true;
                    }; break;
                default : isValide = true;
            };
        };
        
        String msg = isValide
                ? "est valide"
                : "n'est pas valide";
        
        System.out.printf("La date %1$d.%2$d.%3$d %4$s.", jour, mois, annee, msg);
    }
}
