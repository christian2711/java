
package javaejerc10;

import java.util.Scanner;
/*11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
 
public class ejercicio11Calculadora {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        boolean salir = false;
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextDouble();
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion deseada");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:

                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 3:

                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 4:

                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir? (S/N)");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    
       }  
                   
                   }
    

        
    
    

