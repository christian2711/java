
package javaapplication29;

import java.util.Scanner;


public class Matriz_asterisc {

   
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cardinalidad de su matriz");
        int n = leer.nextInt();
         int n2 = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                if ( i==0 || j==0 || i==(n-1) || j==(n2-1 )){
                    System.out.print(" * ");
                    
                }else{
                   System.out.print(" ");}
                
            }
            System.out.println("");
        }
    }
    
}
