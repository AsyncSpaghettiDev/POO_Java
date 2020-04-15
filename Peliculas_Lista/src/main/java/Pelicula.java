public class Pelicula {
    private String titulo;
    private int año;
    private String pais;
    private String director;
    public Pelicula(){}
    public Pelicula(String titulo){
        this.titulo=titulo;
    }
    public void imprime(){
        System.out.println(this.titulo);
    }
}
