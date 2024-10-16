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
public class S2ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir le 1er nombre : ");
        double a = scanner.nextDouble();
        
        System.out.print("Veuillez saisir le 2eme nombre : ");
        double b = scanner.nextDouble();
        
        System.out.print("Veuillez saisir le 3eme nombre : ");
        double c = scanner.nextDouble();
        
        String msg = (a <= b && b <= c)
                ? a + ", " + b + " " + c + "."
                : (a <= c && c <= b)
                ? a + ", " + c + " " + b + "."
                : (b <= a && a <= c)
                ? b + ", " + a + " " + c + "."
                : (b <= c && c <= a)
                ? b + ", " + c + " " + a + "."
                : (c <= b && b <= a)
                ? c + ", " + b + " " + a + "."
                : c + ", " + a + " " + b + ".";
        
        System.out.println("Vous avez saisi les nombres " + msg);
    }
    
}
