import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(12,13,"Rojo"));
        figuras.add(new Rectangulo(12,13,"Azul"));
        figuras.add(new Rectangulo(12,13,"Rojo"));
        figuras.add(new Circulo(12,13,"Azul"));
        figuras.add(new Circulo(10,10,"Rojo"));
        
        for(Figura a:figuras){
            a.dibuja();
        }
    }
}