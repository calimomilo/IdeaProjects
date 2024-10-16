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
public class S1ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Combien de photos avez-vous : ");
        int photos = scanner.nextInt();
        
        System.out.print("Combien de photos par ligne : ");
        int photosParLigne = scanner.nextInt();

        int lignes = (int)(photos / photosParLigne);
        int derniereLigne = photos % photosParLigne;
                
        System.out.println("Il y aura " + lignes + " lignes constituees de " 
                + photosParLigne + " photos.\nIl y aura " + derniereLigne 
                + " photos sur la derniere ligne.");
    }
    
}
