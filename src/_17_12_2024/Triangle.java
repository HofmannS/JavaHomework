package _17_12_2024;

public class Triangle extends Figure {

    public Triangle(int width, int size, int size2) {
        super(width);
        this.side = size;
        this.side2 = size2;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    private int side2;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public Triangle(int width, int height) {
        super(width);
        this.height = height;
    }
    @Override
    public void findFigureArea(){
        if (height != 0) {
            this.setArea((super.getWidth() * this.height) / 2.0);
        } else {
            int side1 = this.getWidth();
            int p = (this.getWidth() + side1 + side) / 2;
            this.setArea(Math.sqrt(p * (p - side1) * (p - side2) * (p - side)));
        }
    }
}
