/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author tante
 */
public class JavaMayus_minusc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
       String  may = frase.toUpperCase();
         String may1 = frase.toLowerCase();
        System.out.println("su frase en mayusculas  es " + may );
        System.out.println("su frase en minisculas es " + may1);
        
        
    }

    private static String toLowercase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String toUppercase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
