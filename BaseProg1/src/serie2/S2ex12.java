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
public class S2ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir la somme a decomposer : ");
        int somme = scanner.nextInt();
        
        byte a = (byte)(somme/5);
        byte b = (byte)((somme%5)/2);
        byte c = (byte)((somme%5)%2);
        
        System.out.printf("Il faut %1$d pieces pour arriver a %2$d.- :\n", a+b+c, somme);
        System.out.printf(a + " pieces de 5.-\n" + b + " pieces de 2.-\n" 
                + c + " pieces de 1.-");
        
    }
    
}
