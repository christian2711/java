
package javaejerc10;

import java.util.Scanner;


public class repetitivas {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero por pantalla");
        int num = leer.nextInt();
         for (int i = 1; i <= num; i++) {
             
             System.out.println("la cadena de su numero es : " + i );
            
        }
        
        
    }
    
}
