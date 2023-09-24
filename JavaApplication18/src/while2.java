
import java.util.Scanner;


public class while2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int suma = 0;
        while (cont <=20){
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            cont = cont + 1;
            if (num !=0){
                suma = suma + num;
                
            }else if (num==0){
                System.out.println("se capturo umero cero");
                break;
            }
                    
        }
        System.out.println("la suma de los numeros ingresados es " + suma); 
    }
    
}
