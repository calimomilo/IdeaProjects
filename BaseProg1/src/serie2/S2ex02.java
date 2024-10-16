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
public class S2ex02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un caractere : ");
        char cara = scanner.next().charAt(0);
                
        String msg = (cara > 'Z')? "minuscule." : "majuscule.";
        System.out.println("Votre caractere est une " + msg);
    }
}
