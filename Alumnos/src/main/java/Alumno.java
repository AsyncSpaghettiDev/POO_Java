public class Alumno {
    protected String nombre;
    protected int matricula;
    public Alumno(String nombre,int matricula){
        this.nombre=nombre;
        this.matricula=matricula;
    }
    public void imprime(){
        System.out.println("Mi nombre es: "+this.nombre+" y mi matricula es: "+this.matricula);
    }
}
