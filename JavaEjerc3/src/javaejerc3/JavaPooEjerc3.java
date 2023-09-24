
package javaejerc3;

import javaejerc3.Operacion.Operacion;
import javaejerc3.newpackage.servicio;

/**
 *3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 * 
 */
public class JavaPooEjerc3 {

   
    public static void main(String[] args) {
        
        Operacion operacion = new Operacion ();
        servicio so = new servicio();
        Operacion operacion1 = so.CrearOperacion();
        System.out.println(operacion1.toString());  
       
        
         System.out.println("el resultado de la suma es: " + so.sumar(operacion1));
         System.out.println("el resultado de la resta es: "+ so.restar(operacion1));
         System.out.println("el resultado de la multiplicacion es: " + so.multiplicacion(operacion1));
         System.out.println("el resultado de la division es: "+ so.dividir(operacion1));
                
        
    }
    
}
