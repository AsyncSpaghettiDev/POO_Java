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
