
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
public class MatrizEjerVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int vuelos[][] = new int[6][3];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese la cantidad de pasajes para el destino" + (i + 1) + "  el horario " + (j + 1));
                vuelos[i][j] = leer.nextInt();
            }
        }
        Scanner leer2 = new Scanner(System.in);
        String bandera = "";
        int destino;
        int horario;
        int pasajes;

        System.out.println("venta de pasajes");
        System.out.println("------------------");
        System.out.println("");
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("ingrese su destino");
            destino = leer.nextInt();
            System.out.println("ingrese su horario");
            horario = leer.nextInt();
            System.out.println("ingrese la cantidad de pasajes");
            pasajes = leer.nextInt();
            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= pasajes) {
                        System.out.println("reserva realizada con exito");
                        vuelos[destino][horario] = vuelos[destino][horario] - pasajes;
                    } else {
                        System.out.println("no hay pasajes disponibles");
                    }
                } else {
                    System.out.println("horario inexistente,ingrese entre 0 y 2 ");
                }
            } else {
                System.out.println("destino inexistente, ingrese entre 0 y 5 ");
            }
            System.out.println("desea continuar reservando, ingrese -finish- para terminar o -si- para continuar");
            bandera = leer2.next();
        }

    }
}


