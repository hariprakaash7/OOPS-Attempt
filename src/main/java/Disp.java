import processing.core.PApplet;
public class Disp extends PApplet {
    public static void main(String[] args) {
     PApplet.main("Disp",args);

    }
    Shapes a=new Shapes(0,100,25,25);
    Shapes b=new Shapes(2,200,33,33);
    Shapes c=new Shapes(4,400,50,50);
    Shapes d=new Shapes(8,800,100,100);
    @Override
    public void settings() {
        super.settings();
        size(1000,1000);
    }

    @Override
    public void setup() {
    }
    @Override
    public void draw() {
        drawCircle(a);
        drawCircle(b);
        drawCircle(c);
        drawCircle(d);
    }
     public void drawCircle(Shapes A)
     {
         ellipse(A.getXaxis(),A.getYaxis(),A.getHeight(),A.getWidth());

     }

}
