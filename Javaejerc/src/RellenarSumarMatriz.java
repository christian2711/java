
import java.util.Random;
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
public class RellenarSumarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int f;
        int c;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese cardinalidad");
        f = leer.nextInt();
        c = leer.nextInt();
        Random aleatorio=new Random();
        int matriz [][] = new int [f][c];
        int suma = 0;
                
        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c ; j++) {
                matriz[i][j] = aleatorio.nextInt(20);
                suma = suma + matriz[i][j];
            }
            
        }
        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c ; j++) {
                System.out.print( "(" + matriz [i][j] + ")" );
                
            }
            System.out.println(" "); 
        }
        System.out.println("la suma de los numeros de su matriz es :" + suma);
    }

    
}
