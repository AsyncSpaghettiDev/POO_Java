import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(new Pelicula("El rey Leon"));
        peliculas.add(new Pelicula("Jurassic Park"));
        peliculas.add(new Pelicula("Titanic"));
        peliculas.add(new Pelicula("Interstellar"));
        peliculas.add(new Pelicula("The reventant"));
        
        for(Pelicula a:peliculas){
            a.imprime();
        }
    }
}
