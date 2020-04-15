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
