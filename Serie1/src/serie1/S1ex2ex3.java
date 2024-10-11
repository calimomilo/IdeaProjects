/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie1;

/**
 *
 * @author paula
 */
public class S1ex2ex3 {
    
    public static void main(String[] args) {
        int nombreDeTours = 3;
        double tempsEnMinParTour = 1.5;
        double tempsTotalEnMin = nombreDeTours * tempsEnMinParTour;
        
        System.out.println("Le temps effectue pour les " + nombreDeTours 
                + " tours est de " + tempsTotalEnMin + " minutes.");
        
        /* Ex 3 */
        
        nombreDeTours++;
        
        System.out.println("Le temps effectue pour les " + nombreDeTours 
                + " tours est de " + tempsTotalEnMin + " minutes.");
    }
    
}
