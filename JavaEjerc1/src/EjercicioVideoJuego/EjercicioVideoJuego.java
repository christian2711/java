





package EjercicioVideoJuego;

import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuego {

   
    public static void main(String[] args) {
       
        List <VideoJuego1> listaVJuego = new ArrayList <> ();
        
        VideoJuego1 video1 = new VideoJuego1("12","super mario","nintendo 64",2,"carreras");
        VideoJuego1 video2 = new VideoJuego1("13","street fighter","pc",2,"shooter");
        VideoJuego1 video3 = new VideoJuego1("14","pac man","nintendo 64",4,"plataforma");
        VideoJuego1 video4 = new VideoJuego1("15","pusle","pc",2,"plataforma");
        VideoJuego1 video5 = new VideoJuego1("16","fifa 2021","play 2",3,"deporte");
        
        listaVJuego.add(video1);
        listaVJuego.add(video2);
        listaVJuego.add(video3);
        listaVJuego.add(video4);
        listaVJuego.add(video5);
        
        
        listaVJuego.stream().forEach((lista) -> {
            System.out.println(lista.toString());
        });
                 
            
        }
}


            
            
        
        
       
        
        
    
    

