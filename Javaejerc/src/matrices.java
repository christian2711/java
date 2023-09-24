
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
public class matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double matriz [][]= new double [4][4];
        Scanner leer = new Scanner(System.in);
        Double suma=0.0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("ingrese  la nota del alumno " + (i+1));
                matriz[i][j]=leer.nextDouble();
                suma = suma + matriz[i][j];
                
            }
            matriz[i][3]=suma / 3;
            suma = 0.0;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("las notas del alumno " +(i+1)+ " son  :" );
            for (int j = 0; j < 4; j++) {
                System.out.println("nota num" + (j+1) + " " +matriz[i][j]);
            }
            System.out.println("el promedio es :" + matriz [i][3]);
        }
    }
    
}
