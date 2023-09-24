
import java.util.Scanner;

public class numerosRomanos {
    /*4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
     equivalente en romano.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero entre uno y diez");

        int num = leer.nextInt();

        switch (num) {
            case 1:
                if (num == 1) {
                    System.out.println("su numero en romano es I");
                }
                break;
            case 2:
                if (num == 2) {
                    System.out.println("su numero en romano es II");
                }
                break;
            case 3:
                if (num == 3) {
                    System.out.println("su numero en romano es III");
                }
                break;
            case 4:
                if (num == 4) {
                    System.out.println("su numero en romano es IV");
                }
                break;
            case 5:
                if (num == 5) {
                    System.out.println("su numero en romano es V");
                }
                break;
            case 6:
                if (num == 6) {
                    System.out.println("su numero en romano es VI");
                }
                break;
            case 7:
                if (num == 7) {
                    System.out.println("su numero en romano es VII");
                }
                break;

            case 8:
                if (num == 8) {
                    System.out.println("su numero en romano es VIII");
                }
                break;
            case 9:
                if (num == 9) {
                    System.out.println("su numero en romano es IX");
                }
                break;

            case 10:
                if (num == 10) {
                    System.out.println("su numero en romano es x");
                }
                break;
            case 11:
                if (num >= 11 || num < 1) {
                
                    System.out.println("el numero ingresado no es valido, intentelo nuevamente");
        }
                break;
        }

    }
}
