
package javaclase3;

import java.util.Scanner;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 * 
 */
public class EjeExt21 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Double [] alumnos = new Double[10];
        int cont1 = 0;
        int cont2 = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("ingrese la nota de primer trabajo practico evaluativo");
            double nota1 = leer.nextDouble();
            System.out.println("ingrese nota del segundo trabajo practico evaluativo");
            double nota2 = leer.nextDouble();
            System.out.println("ingrese nota del primer integrador");
            double nota3 = leer.nextDouble();
            System.out.println("ingrese nota del segundo trabajo integrador");
            double nota4 = leer.nextDouble();
            double promedio = (nota1 *0.10) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.50);
            System.out.println("el alumno: " + i +1 + " tiene un promedio de: "+ promedio);
                    
        
        if (promedio >= 7){
            System.out.println("el alumno aprobo el curso");
            cont1 = cont1 + 1;
        }else {
            System.out.println("el alumno no aprobo el curso");

            cont2 = cont2 + 1;
        }
        }
        System.out.println("los alumnos que aprobaron el corso son: "+ cont1); 
        System.out.println("los alumnos reprobados son: "+ cont2);
    }
    
}
