package _10_12_2024;

import java.util.Random;

public class CustomObject {
    int id;
    double value;
    boolean isActive;
    char symbol;
    float weight;
    byte age;
    short level;

    public CustomObject() {

    }

    public CustomObject(int id, double value, boolean isActive, char symbol, float weight, byte age, short level) {
        this.id = id;
        this.value = value;
        this.isActive = isActive;
        this.symbol = symbol;
        this.weight = weight;
        this.age = age;
        this.level = level;
    }

    public static void main(String[] args) {
        CustomObject[] customObjects = CustomObject.generate();
        for (int i = 0; i < customObjects.length; i++) {
            System.out.println("customObjects[" + i + "] = " + customObjects[i]);
        }
    }

    public static CustomObject[] generate() {
        Random random = new Random();
        CustomObject[] customObjects = new CustomObject[20];
        for (int i = 0; i < customObjects.length; i++) {
            customObjects[i] = new CustomObject(i+1,
                    random.nextDouble(0,100),
                    random.nextBoolean(),
                    (char)random.nextInt(65,90),
                    random.nextFloat(1,50),
                    (byte)random.nextInt(0, 128),
                    (short)random.nextDouble(0, 32.767));
        }
        return customObjects;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "id=" + id +
                ", value=" + value +
                ", isActive=" + isActive +
                ", symbol=" + symbol +
                ", weight=" + weight +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}
