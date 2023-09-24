
package javaejerc10;

import java.util.Scanner;

public class repetitivas2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String palabra=null;
       while(!"salir".equals(palabra)){
           
           System.out.println("ingrese una palabra , cuando quiera retirarse ingrese -salir-");
            palabra = leer.nextLine();
           
       }
        
    }
    
}
