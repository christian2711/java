
import java.util.Scanner;


/**Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
* y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla
* y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.


Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
* Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 *
 * 
 */
public class ejercSimbolos {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese una frase o palabra");
        String frase = sc.nextLine();
        
      
    }
    
    public String codificar(String frase){
        
       frase.replaceAll("a", "@");
       frase.replaceAll("e", "#");
       
            
        
        
    }
}
