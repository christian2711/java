
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
public class ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        int suma=n1+n2;
        System.out.println("la suma de sus numeros es " + suma);
    }
    
}
