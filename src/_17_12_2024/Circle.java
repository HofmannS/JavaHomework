package _17_12_2024;

public class Circle extends Figure{

    public Circle(int width) {
       super(width);
       radius = width/2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    @Override
    public void findFigureArea(){
        this.setArea(Math.PI* radius*radius);
    }

}
