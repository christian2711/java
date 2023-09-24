
import java.util.Scanner;


public class SumaNum_naturls {

    
    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("ingrese un num positivo");
            num = leer.nextInt();

            if (num > 1000) {
                System.out.println("porgrama largo , seguro?");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }

            }
        } while (num <= 0 || num > 1000);

        int j;
        int suma;
        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) {
                continue;
            }

            suma = 0;
            j = 1;

            while (j <= i) {
                suma += j;
                j++;
            }
            System.out.println("la suma de los " + i + "numeros nat es :" + suma);
        }

    }
}

    
    

