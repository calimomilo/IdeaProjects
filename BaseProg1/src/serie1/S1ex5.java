/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie1;

/**
 *
 * @author paula
 */
public class S1ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
        
        int xTemp = x;
        
        x = y;
        y = z;
        z = xTemp;
        
        System.out.println("\nx = " + x + "\ny = " + y + "\nz = " + z);
    }
    
}
