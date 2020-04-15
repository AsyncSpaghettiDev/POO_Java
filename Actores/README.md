```Java
public class Actor {
    private String nombre;
    private int fecha_nac;
    public Actor(){}
    public Actor(String nombre,int fecha_nac){
        this.nombre=nombre;
        this.fecha_nac=fecha_nac;
    }
    public String getNombre(){
        return this.nombre;
    }
}
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
public class Program {
    public static void main(String[] args) {
        Pelicula p1=new Pelicula("La la land",2016);
        p1.addActor(new Actor("Ryan Gosling",1980));
        p1.addActor(new Actor("Emma Stone",1988));
        
        p1.getActores();
    }
}