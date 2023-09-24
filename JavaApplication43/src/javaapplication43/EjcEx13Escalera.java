
package javaapplication43;

import java.util.Scanner;

/**
 *Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 * 
 */
public class EjcEx13Escalera {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero para su escalera");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print( j + 1 );
            }
            System.out.println(" ");
        }
        
    }
    
}
