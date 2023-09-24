
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tante
 */
public class javeVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
      String[] vector = new String[4];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese 4 nombres");
           String nombre=leer.next();
            vector[i]=nombre;
            
            
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector " + i + " : " + vector[i]);
            
        }
       
    }
    
}
