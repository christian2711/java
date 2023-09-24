/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author tante
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ciudad [] = new String [5];
        Double minima [] = new Double [5];
        double maxima [] = new double [5];
        Scanner leer2 = new Scanner(System.in);
        
        
        for (int i = 0; i < ciudad.length ; i++) {
            
            System.out.println("ingrese la ciudad " + (i+1) );
            ciudad[i] = leer.next();
            
            System.out.println("ingrese temp minima de la ciudad " + (i+1) );
            minima[i] = leer2.nextDouble();
            
            System.out.println("ingrese la temp maxima de la ciudad " + (i+1));
            maxima[i] = leer2.nextDouble();
            
        }
        int posMin= -1;
        Double min = 99999.99;
        for (int i = 0; i < minima.length; i++) {
            
            if( minima[i]<min ){
                min=minima[i];
                posMin = i;
            }
            
        }
      double max = -9999.99;
      int posMax = 1;
        for (int i = 0; i < maxima.length; i++) {
            if(maxima[i] > max){
                max=maxima[i];
                posMax = i;
            }
            
        }
        System.out.println("la temperatura minima es de :" + min );
        System.out.println("se registro en la ciudad :" + ciudad [posMin] );
        System.out.println("la temperatura maxima es de :" + max);
        System.out.println("se registro en la ciudad :" + ciudad [posMax] );
    }
    
}
