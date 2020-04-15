public class Circulo extends Figura{
    public Circulo(int x,int y,String color){
        super(x,y,color);
    }
    public void dibuja(){
        System.out.println("Se dibuja un circulo color "+this.color);
    }
}
