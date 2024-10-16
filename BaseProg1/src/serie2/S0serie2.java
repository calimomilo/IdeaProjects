/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/serie4.Main.java to edit this template
 */
package serie2;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class S0serie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        
        System.out.print("Entrez votre numero de telephone : ");
        String tel = scanner.nextLine();
        
        System.out.println("Nom : " + nom + "\nNo Tel : " + tel);
*/
        for (int i = 0; i < 10; i++) {
            System.out.print("entrez un chiffre : ");
            double chiffre = scanner.nextDouble();
            
            chiffre = (Math.round(chiffre*20))/20.0;
            
            System.out.println(chiffre);
        }
    }
}
