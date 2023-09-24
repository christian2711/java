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
public class JavaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         System.out.println("ingrese edad");
        int edad = leer.nextInt();
       
        Scanner leer2 = new Scanner(System.in);
        
        System.out.println("ingrese nombre");
        String nombre = leer2.nextLine();
        
         System.out.println("ingrese dni");
        String dni = leer.next();
        
        
        while((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))){
            if(edad>=6 && edad<=10){
                System.out.println("le corresponde categoria menores A");
            }else{
                if(edad>=11 && edad<=17){
                    System.out.println("le corresponde categoria menores B");
                }else{
                    if(edad>=18 && edad<=30){
                        System.out.println("le corresponde categoria juveniles");
                    }else{
                        if(edad>=31 && edad<=50){
                            System.out.println("le corresponde categoria mayores");
                        }else {
                            if(edad>51){
                                System.out.println("le corresponde categoria adultos mayore");
                            }else{
                                System.out.println("la edad ingresada no corresponde a una categoria valida");
                            }
                        }
                    }
                }
            }
            //aca
            System.out.println("ingrese edad");
         edad = leer.nextInt();
          System.out.println("ingrese nombre");
         nombre = leer2.nextLine();
            System.out.println("ingrese dni");
            dni = leer2.nextLine();
         
        }
        
    }
    
}
