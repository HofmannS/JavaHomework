package _17_12_2024;

import java.util.Random;

public class Generator {
    public static Circle generateCircle() {
        Random rnd = new Random();
        return new Circle(rnd.nextInt(1,100));
    }

    public static Square generateSquare() {
        Random rnd = new Random();
        return new Square(rnd.nextInt(100));
    }
    public static Triangle generateTriangle() {
        Random rnd = new Random();
        return new Triangle(rnd.nextInt(1,100), rnd.nextInt(1,100));
    }

    public static double[] getArrayOfCircles(){
        double[] arrayOfCircles = new double[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            double radius = rnd.nextDouble(1,100);
            arrayOfCircles[i] = Math.PI* radius * radius;
        }
        return arrayOfCircles;
    }
    public static int[] getArrayOfSqueres(){
        int[] arrayOfSqueres = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int side = rnd.nextInt(1,100);
            arrayOfSqueres[i] = (int) Math.pow (side, 2);
        }
        return arrayOfSqueres;
    }
    public static int[] getArrayOfTriangeles() {
        int[] arrayOfTriangeles = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int width = rnd.nextInt(1, 100);
            int height = rnd.nextInt(1, 100);
            arrayOfTriangeles[i] = (int) ((width * height) / 2.0);
        }
        return arrayOfTriangeles;
    }
}
