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
public class condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
        System.out.println("ingrese la categoria");
        int categ = leer.nextInt();
        double sueldo=0;
        if (categ==1){
            sueldo = 15890+(15890*0.10);
        }else{
            if(categ==2){
                sueldo=25890;
            }else{
                if(categ==3){
                    sueldo=35891-(35891*0.11);
                }
            }
        }
        System.out.println("la categoria es :"+ categ + " y el sueldo correspondiente es :" + sueldo); 
    }
    
}
