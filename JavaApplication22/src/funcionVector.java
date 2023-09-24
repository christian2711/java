
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// crear una función rellene un vector con números aleatorios, pasándole un arreglo por
// parametro. Después haremos otra función o procedimiento que imprima el vector.
/**
 *
 * @author tante
 */
public class funcionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector [] = new int [5];
        rellenar(vector);
        
       mostrar(vector);
    } 
        
    
 public static void rellenar(int [] vector){
       Random aleatorio = new Random();
        
       
       for (int i = 0; i < 5 ; i++) {
           vector [i]=aleatorio.nextInt(20);
        
           
       }
       
   }
      public static void mostrar(int [] vector) {
          
          for (int i = 0; i < 5 ; i++) {
              System.out.print("(" + vector [i] + ")");
              
          }
          
      }
   }

