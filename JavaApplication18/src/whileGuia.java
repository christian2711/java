
import java.util.Scanner;


public class whileGuia {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      System.out.println("ingrese una nota");
                int num = leer.nextInt();
        
        while (num>=0 && num<=10){
              
            System.out.println("nota validada");
            break;
        }
            
        
    }
    
}
