
package javaejerc;

import java.util.Scanner;


public class javaVectorNumeros3 {

   
    public static void main(String[] args) {
        int vector[]= new int[5];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese sus numeros");
            vector[i]= leer.nextInt();
            
        }
        int cont = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if ( vector[i] == 3 ){;
            cont = cont + 1;
            }
        }
       System.out.println("la cantidad de num 3 que hay en el vector es :" + cont); 
    }
   
}
