
package javaapplication32;

import java.util.Scanner;


public class vector {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String vector [] = new String [8];
        
        vector [0] = "ale";
        vector [1] = "gabi";
        vector [2] = "rosa";
        vector [3] = "fran";
        vector [4] = "dani";
        vector [5] = "cris";
        vector [6] = "tato";
        vector [7] = "mile";
        
        for (int i = 0; i < vector.length; i++) {
            
            
            System.out.println("en la posicion " + i + " esta el nombre " + vector[i]);
            
        }
        
        
        
    }
    
}
