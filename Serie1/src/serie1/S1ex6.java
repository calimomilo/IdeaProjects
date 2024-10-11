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
public class S1ex6 {
    public static void main(String[] args) {
        System.out.print("Veuillez saisir la valeur du rayon du cercle : ");
        
        Scanner scanner = new Scanner(System.in);
        double rayon = scanner.nextDouble();
        
        double surface = 2 * Math.PI * rayon;
        double circonference = Math.PI * rayon * rayon;
        
        System.out.println("La surface du cercle est de " + surface + ".");
        System.out.println("La circonference du cercle est de " + circonference + ".");
    }
    
}
