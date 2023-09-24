
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tante
 */
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero" );  
        
              int num = leer.nextInt();
              
              int doble = num * 2;
              System.out.println("el doble de su numero es : " + doble);
              int triple = num * 3;
              System.out.println("el triple de su numero es :" + triple);
              Double raiz = Math.sqrt(num);
             System.out.println("la raiz de su numero es : " + raiz);
            
              
    }
    
}
