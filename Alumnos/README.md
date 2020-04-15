```Java
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
public class Licenciatura extends Alumno{
    private String carrera;
    private int semestre;
    private String act_esp;
    public Licenciatura(String nombre,int matricula,String carrera,int semestre){
        super(nombre,matricula);
        this.carrera=carrera;
        this.semestre=semestre;
        if(semestre>8) act_esp="Residencia";
        else act_esp="Servicio Social";
    }
    public void imprime(){
        System.out.println("Mi nombre es " + this.nombre+", estoy en el semestre "+this.semestre+" de la carrera "+this.carrera+"\nMi matricula es "+this.matricula+" y actualmente estoy haciendo "+this.act_esp);
    }
}
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
public class Program {
    public static void main(String[] args) {
        Alumno a=new Alumno("Pedro",12546952);
        a.imprime();
        
        Licenciatura b= new Licenciatura("Jonathan",19211688,"Ingenieria en Sistemas Computacionales",3);
        b.imprime();
        
        Posgrado c=new Posgrado("Mario",15110684,"Tecnologias de la Informacion y comunicacion",5,"Intelifencia Artificial");
        c.imprime();
    }
}