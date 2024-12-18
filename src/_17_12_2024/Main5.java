package _17_12_2024;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        Figure circle = Generator.generateCircle();
        circle.findFigureArea();
        System.out.println(circle.getArea());

        Figure triangle = Generator.generateTriangle();
        triangle.findFigureArea();
        System.out.println(triangle.getArea());

        Figure square =Generator.generateSquare();
        square.findFigureArea();
        System.out.println(square.getArea());

        System.out.println(Arrays.toString(Generator.getArrayOfCircles()));

        System.out.println(Arrays.toString(Generator.getArrayOfSqueres()));

        System.out.println(Arrays.toString(Generator.getArrayOfTriangeles()));
    }
}
