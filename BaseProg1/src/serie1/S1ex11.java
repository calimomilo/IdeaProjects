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
public class S1ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();
        
        System.out.print("Veuillez saisir un diviseur : ");
        int div = scanner.nextInt();
        
        boolean isDiv = (nombre % div == 0);
        System.out.println(nombre + " est-il divisible par " + div + " : " + isDiv);
    }
    
}
