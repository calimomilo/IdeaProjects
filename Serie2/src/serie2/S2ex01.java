/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie2;

//import java.util.Scanner;
import ch.comem.Clavier;

/**
 *
 * @author paula
 */
public class S2ex01 {
        
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez entrer un nombre : ");
        double nombre = scanner.nextDouble();
        double absolu = (nombre < 0) ? -nombre : nombre;
        
        System.out.println("La valeur absolue de " + nombre + " est " 
                + absolu);
        */
        
        double no = Clavier.rend_double("Veuillez entrer un nombre : ");
        double abs = (no < 0) ? -no : no;
        
        System.out.println("La valeur absolue de " + no + " est " + abs + ".");

    }
}
