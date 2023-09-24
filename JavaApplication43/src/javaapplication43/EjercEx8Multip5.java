package javaapplication43;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 */
public class EjercEx8Multip5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int num;

        do {

            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num % 2 == 0) {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }

        } while (num % 5 != 0);
        System.out.println("los numeros pares fueron " + cont1);
        System.out.println("los numeros impares fueron " + cont2);
        System.out.println("el total de numeros ingresados es " + (cont1 + cont2));
    }
}
