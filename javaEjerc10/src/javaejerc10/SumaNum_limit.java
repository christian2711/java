
package javaejerc10;

import java.util.Scanner;


public class SumaNum_limit {
//10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero limite positivo");
        int num = leer.nextInt();
        int suma=0;
        while(suma<=num){
            
            System.out.println("ingrese un numero");
            int n1 = leer.nextInt();
            suma = suma + n1;
            
        }
        
        System.out.println("se supero el limite inicial"); 
    }
    
}
