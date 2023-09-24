
import java.util.Scanner;


public class numeroMayor {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  
 
  
        System.out.println("ingrese un numero");
        int n1=leer.nextInt();
                
        System.out.println("ingrese otro numero");
        int n2=leer.nextInt();
        
        if (n1>25){
            System.out.println("n1 es mayor a 25");
        }else if (n1<25){
            System.out.println("n1 es menor a 25");
        } if (n2 > 25){
            System.out.println("n2 es mayor a 25");
        }else if (n2<25){
            System.out.println("n2 es menor a 25");
        }
        
    }
}


    

