/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerceureka;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author tante
 */
public class eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese palabra");
        String palabra = leer.nextLine();

        String eureka = null;

        while (!palabra.equalsIgnoreCase(eureka)) {
            if ("eureka".equals(palabra)) {
                System.out.println("correcto");
                break;
            } else {
                System.out.println("intente otra vez");
            }
         System.out.println("ingrese palabra");
        palabra = leer.nextLine(); 
            
                    
                }
            }
        }

    


