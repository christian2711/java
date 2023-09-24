

/**2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar*/
 
public class pasoValorPOrVariable {

    
    public static void main(String[] args) {
        
        int a=2;
                int b=5;
                        int c=8;
                                int d=10;
                                
                                
                                System.out.println("variables .._a/" + a + "-b/"+b + "-c/"+ c + "-d/"+ d );
        
        int x=0;
        int m=0;
        
        m=a;
        x=d;
        d=b;
        b=c;
        a=x;
        c=m;
        
        System.out.println("variables .._a/" + a + "-b/"+b + "-c/"+ c + "-d/"+ d);
        
        
    }
    
}
