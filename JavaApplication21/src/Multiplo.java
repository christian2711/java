
import java.util.Scanner;
/*Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer
número es múltiplo del segundo, sino informe que no lo son.
/*
*/


public class Multiplo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        multiplo (n1,n2);
       
    }
  public static void multiplo (int n1, int n2){
     
      if (n1%n2==0){
          
          System.out.println("el primer numero ingresado es multiplo del segundo");
      }else System.out.println("el primer numero no es multiplo del segundo");
      
      
  }  
}
