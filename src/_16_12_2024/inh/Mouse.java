package _16_12_2024.inh;

public class Mouse extends EDevice {
}

class Keyboard extends EDevice {
}

class Display extends EDevice {
}

class Button extends Keyboard {
}

class EDevice {
}

class Main5 {
    public static void main(String[] args) {
        EDevice mouse = new Mouse();
        EDevice keyboard = new Keyboard();

        Object o = new Mouse();

        int a = 128;
        byte b = (byte) a;

        System.out.println(b);
    }

    public void show1(Object o) {
        if(o instanceof Mouse) {

        } else {

        }
    }
}