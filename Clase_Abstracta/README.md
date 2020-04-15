```Java
public abstract class Figura {
    protected int x;
    protected int y;
    protected int z;
    protected String color;
    
    public Figura(int x, int y,String color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    public abstract void dibuja();
    public void printColor(){
        System.out.println(this.color);
    }
}
public class Circulo extends Figura{
    public Circulo(int x,int y,String color){
        super(x,y,color);
    }
    public void dibuja(){
        System.out.println("Se dibuja un circulo color "+this.color);
    }
}
public class Rectangulo extends Figura{
    public Rectangulo(int x,int y,String color){
        super(x,y,color);
    }
    public void dibuja(){
        System.out.println("Se dibuja un rectangulo color "+this.color);
    }
}

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