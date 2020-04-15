public class Rectangulo extends Figura{
    public Rectangulo(int x,int y,String color){
        super(x,y,color);
    }
    public void dibuja(){
        System.out.println("Se dibuja un rectangulo color "+this.color);
    }
}
