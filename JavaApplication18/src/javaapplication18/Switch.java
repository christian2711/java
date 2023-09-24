
package javaapplication18;

import java.util.Scanner;


public class Switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tipo de motor de su bomba si es numero 1/2/3/4");
        int num = leer.nextInt();
        
        
        switch (num){
            case 1: 
                System.out.println("la bomba es bomba de agua");
                break;
            case 2:
                System.out.println("la bomba es de gasolina");
                break;
            case 3:
                System.out.println("bomba de hormigon");
                break;
            case 4:
                System.out.println("bomba alimenticia");
                break;
                default:
                System.out.println("no existe esa bomba");
                
        }
        
    }
    
}
