
package javaejerceureka;

import java.util.Scanner;


public class NewMain {
//Crear un programa que dado un número determine si es par o impar.
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero entero");
         int num = leer.nextInt();
         
         if(num % 2 == 0){
             System.out.println("el numero ingresado es par");
         }
         else{
          System.out.println("el numero ingresa es impar");
         }
        
    }
    
}
