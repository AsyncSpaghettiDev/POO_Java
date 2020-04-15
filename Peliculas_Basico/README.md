```Java
public class Pelicula {
    private String titulo;
    private int año;
    private String pais;
    private String director;
    public Pelicula(){}
    public Pelicula(String titulo,int año){
        this.titulo=titulo;
        this.año=año;
    }
    public void imprime(){
        System.out.println("La pelicula "+this.titulo+" se estrenó en el año "+this.año+".");
    }
}
public class Program {
    public static void main() {
        Pelicula p1=new Pelicula("La forma del Agua",2017);
        p1.imprime();
        
        Pelicula p3=new Pelicula("El discurso del Rey",2010);
        p3.imprime();
    }
}