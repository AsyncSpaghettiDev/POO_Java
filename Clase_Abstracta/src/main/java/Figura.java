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