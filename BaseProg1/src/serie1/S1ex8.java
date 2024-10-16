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
public class S1ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Note de l'examen intermediaire : ");
        double noteExamInt = scanner.nextDouble();
        
        System.out.print("Note de projet : ");
        double noteProj = scanner.nextDouble();
        
        System.out.print("Note de l'examen final : ");
        double noteExamFin = scanner.nextDouble();
        
        double moyenne = (noteExamInt *2 + noteProj + noteExamFin*3) / 6;
        System.out.println("\nMoyenne : " + moyenne);
    }
}
