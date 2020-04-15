public class Posgrado extends Alumno{
    private String especialidad;
    private int cuatrimestre;
    private String tema;
    public Posgrado(String nombre,int matricula,String especialidad,int cuatrimestre,String tema){
        super(nombre,matricula);
        this.especialidad=especialidad;
        this.cuatrimestre=cuatrimestre;
        this.tema=tema;
    }
    public void imprime(){
        System.out.println("Mi nombre es: "+this.nombre+" estoy en el cuatrimestre "+this.cuatrimestre+" de la especialidad "+this.especialidad+"\nMi matricula es "+this.matricula+" y mi tema de investigación es: "+this.tema);
    }
}
