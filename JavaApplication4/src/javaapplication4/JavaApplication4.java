
package javaapplication4;


public class JavaApplication4 {

    
    public static void main(String[] args) {
        
        int dia=1;
                String nombredia ;
        switch (dia){
                    case 1: nombredia="lunes";
                    break;
                    case 2: nombredia="martes";
                    break;
                    case 3: nombredia="miercoles";
                    break;
                    case 4:nombredia="jueves";
                    break;
                    case 5:nombredia="viernes";
                    break;
                    default:nombredia="no corresponde el dia";
                    break;}
                
                        System.out.println("el dia seleccionado es : " + nombredia);
                }
    
}

