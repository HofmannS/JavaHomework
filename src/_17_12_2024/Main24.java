package _17_12_2024;

public class Main24 {
    public static void main(String[] args) {
        int x = 3;
        int x1 = 31;

        int[] arr = {123, 234};

        Box[] boxes = {new Box(), new Box()};
        AbstractBox[] abstractBoxes = {new Gift(), new Box(), new AbstractBox()};
        Pers pers = new Pers();
        pers.abstractBoxes = abstractBoxes;

    }
}

class Box extends AbstractBox{
    int id;
    int weight;
    double volume;

}

class Gift extends AbstractBox{
    int id;
    double price;
}

class AbstractBox {

}

class Pers {
    AbstractBox[] abstractBoxes;
}