
import java.util.Scanner;


public class Condicional_switch {

    
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("califique la peli de 1 a 5 estrellas ");
        opinion= leer.nextInt();
        
        if (opinion >=1 && opinion <=5){
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados");
                    break;
                case 3:
                    System.out.println("calificado buena");
                    break;
                case 4:
                    System.out.println("calificado muy buena");
                    break;
                    
                case 5:
                    System.out.println("excelente");
                    break;}
        } else if (opinion < 0){
                            System.out.println("muy mala");
                            
                            }
                    else if (opinion==0){
                            System.out.println("no valido");
                            }
                    else {
                            System.out.println("mal ingreso");
                            }
                    System.out.println("hasta la proxima");
            }
        }
    
    

