
import static java.lang.Math.random;
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
public class MatrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Random aleatorio=new Random();
      
        int [][]  matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz [i][j]=aleatorio.nextInt(20);
                    
                
            }
            
        }
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4 ; j++) {
                 System.out.print("(" + matriz [i][j] + ")");
                
            }
            System.out.println(""); 
        }
        System.out.println("la matriz traspuesta sera....");
        
        System.out.println("");
        
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("(" + matriz [j][i] + ")");
            }
            System.out.println(""); 
        }
        }
    }
    

