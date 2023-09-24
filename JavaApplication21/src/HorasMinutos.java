
import java.util.Scanner;
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class HorasMinutos {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese los minutos a convertir");
        int minut = leer.nextInt();
        
        int dia =  (int) Math.floor(minut / 1440);
        System.out.println("dia = " + dia);
        int resto;
        resto = minut % 1440; 
        int hora = (int) Math.floor(resto / 60);
        System.out.println("las horas son: " + hora);
        
        
    }
    
}
