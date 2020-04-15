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