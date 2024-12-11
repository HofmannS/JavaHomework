package _10_12_2024;

public class Human {
    int id;
    String name;
    int age;
    Pet pet;

    public Human (int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Human(int id, String name, int age, Pet pet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Human human = new Human(1, "Nik", 22);
        Human human1 = new Human(2, "NU", 32);

        Pet pet = new Pet(1, "Barsik");

        Human humanPet = new Human(3, "Mik", 33, pet);
    }
}