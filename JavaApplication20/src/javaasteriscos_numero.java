
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
public class javaasteriscos_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont = 0;

        while (cont < 20) {
            System.out.println("ingrese un numero entre 1 y 20");

            int num = leer.nextInt();
            cont = cont + 1;
            System.out.print(num);

            for (int i = 0; i < num; i++) {
                System.out.print(" * ");

            }
        }
    }
}
    

