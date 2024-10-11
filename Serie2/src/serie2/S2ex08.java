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
public class S2ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez le prix du billet : ");
        double prixBillet = scanner.nextDouble();
        
        System.out.println("""
                           Tapez 1 si vous etes un client normal,
                           Tapez 2 si vous etes un employe de la compagnie,
                           Tapez 3 si vous etes membre du club CIGOGNE.""");
        byte type = scanner.nextByte();
        
        System.out.println("Entrez le nombre de vols effectues avec notre compagnie : ");
        short vols = scanner.nextShort();
        
        byte rabais = 0;
        switch(type) {
            case 1 : break;
            case 2 : rabais = 20; break;
            case 3 : rabais = 10; break;
            default : System.out.println("le type entré n'est pas valable.");
        }
        
        switch(vols) {
            case 0 : break;
            case 1 : rabais += 10; break;
            case 2 :
            case 3 :
            case 4 : rabais += 15; break;
            default : rabais += 20; break;
        }
        
        double prixFinalArrondi = Math.round(prixBillet*((100-rabais)/100.0)*20)/20.0;
        
        System.out.println("Prix de base : " + prixBillet + "\nVotre rabais : " 
                + rabais + "%");
        System.out.printf("Votre prix : %.2f.-", prixFinalArrondi);
    }
}
