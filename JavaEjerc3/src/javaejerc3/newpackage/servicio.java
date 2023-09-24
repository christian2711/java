
package javaejerc3.newpackage;

import java.util.Scanner;
import javaejerc3.Operacion.Operacion;

/**3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
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
 * 
 */
public class servicio {
    
    Scanner lee = new Scanner (System.in);
   
     double multiplicacion;
     double dividir;
    
    
    public  Operacion CrearOperacion (){
        Operacion operacion = new Operacion();
        
        System.out.println("ingrese un numero");
           operacion.setNum1(lee.nextDouble());
          System.out.println("ingrese numero");
          operacion.setNum2(lee.nextDouble());
        
          return  operacion;
        
          
       
    }
    
   public double sumar(Operacion operacion){
       Double sumar = operacion.getNum1() + operacion.getNum2();
       return sumar;
   }
   
    public double restar(Operacion operacion){
        Double restar = operacion.getNum1() - operacion.getNum2();
        return restar;
        
    }
     
    public int multiplicacion(Operacion operacion){
        
        if(operacion.getNum1() == 0 || operacion.getNum2() == 0){
            System.out.println("multiplicacion por cero , error");
            return 0;
        }else{
            return (int) (operacion.getNum1() * operacion.getNum2());
            
        }
        
    }
    
    public double dividir(Operacion operacion){
        
        if(operacion.getNum1() == 0 || operacion.getNum2() == 0){
            System.out.println("division por cero, error");
            return 0;
        }else{
            return  operacion.getNum1() / operacion.getNum2();
            
        }
        
       
    }

   
}
