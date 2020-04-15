import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private int año;
    private ArrayList<Actor> actores;
    public Pelicula(){}
    public Pelicula(String titulo,int año){
        this.titulo=titulo;
        this.año=año;
        actores=new ArrayList<Actor>();
    }
    public void imprime(){
        System.out.println(this.titulo);
    }
    public void addActor(Actor n){
        actores.add(n);
    }
    public void getActores(){
        System.out.println("Los actores de la pelicula "+this.titulo+" son:");
        for(Actor a:actores){
            System.out.println(a.getNombre());
        }
    }
}