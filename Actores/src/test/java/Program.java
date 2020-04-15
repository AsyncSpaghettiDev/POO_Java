public class Program {
    public static void main(String[] args) {
        Pelicula p1=new Pelicula("La la land",2016);
        p1.addActor(new Actor("Ryan Gosling",1980));
        p1.addActor(new Actor("Emma Stone",1988));
        
        p1.getActores();
    }
}
