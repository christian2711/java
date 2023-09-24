
package javaapplication32;

import java.util.Arrays;
import java.util.Random;

public class javaPooEjerc10 {

    /**Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20
     */
    public static void main(String[] args) {
        
        double vect_a[] = new double [50];
        double vect_b[] = new double [20];
        rellenar(vect_a);
        mostrar(vect_a);
        ordenar(vect_a);
       cargar1(vect_a,vect_b);
       cargar2(vect_b);
    }
    
    public static void rellenar(double [] vect_a){
       Random aleatorio = new Random();
        
       
       for (int i = 0; i < 50 ; i++) {
           vect_a [i]=aleatorio.nextDouble();
        
           
       }
    }
       public static void mostrar(double [] vect_a) {
          
          for (int i = 0; i < 50 ; i++) {
              System.out.print("(" + vect_a [i] + ")");
              
          }
          System.out.println("-------------------");
      }
    public static void ordenar(double[] vect_a){
        Arrays.sort(vect_a);
        System.out.println("vector ordenado: " + Arrays.toString(vect_a));
    }
        
     public static void cargar1 (double [] vect_a,double[] vect_b){
         
         for (int i = 0; i < 10; i++) {
             vect_b[i]=vect_a[i];
             
         }
          System.out.println("carga1: vector b con los primeros 10 numeros del vector a" + Arrays.toString(vect_b));
     }
     public static void cargar2 (double [] vect_b){
         
         for (int i = 10; i < 20; i++) {
             vect_b[i] =  0.5;
             
         }
         System.out.println("carga 2: vector b con 10 numeros de vector a y 0.5 " + Arrays.toString(vect_b));
     }

  
     
}
