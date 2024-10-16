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
public class S2ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saisissez l'age de la personne : ");
        byte age = scanner.nextByte();
        
        System.out.println("Veuillez entrer le nom du jour en minuscule (Ex: lundi) : ");
        String jour = scanner.next();
                
        byte prixBase = (age <=7)
                ? 5
                : (age <=18)
                ? 10
                : (byte)15;
        
        byte rabais = 0;
        switch(jour) {
            case "lundi" : rabais = 20; break;
            case "mardi" :
            case "jeudi" : rabais = 10; break;
            default : break;
        }
        
        double prixFinalArrondi = Math.round(prixBase*((100-rabais)/100.0)*2)/2.0;
        
        System.out.println("Prix de base : " + prixBase + "\nVotre rabais : " 
                + rabais + "%");
        System.out.printf("Votre prix : %.2f.-", prixFinalArrondi);
    }
    
}
