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
