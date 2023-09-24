
package javaapplication28;

import java.util.Scanner;


public class JavaCuad_asterisc {
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
ram args the command line arguments
     */
    public static void main(String[] args) {
      
Scanner leer = new Scanner(System.in);
  

        System.out.println("ingrese el tamaño de su cuadrado");
        
        int n1 = leer.nextInt();
        
        for (int i = 0; i < n1 ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int i = 0; i < n1-2 ; i++) {
            System.out.print("*");
            for (int j = 0; j < n1-2 ; j++) {
                System.out.print(" ");
                } 
            System.out.println("*");
            }
        
        
        for (int i = 0; i < n1 ; i++) {
            System.out.print("*");
        }
        
        }
        
    }


        
        



