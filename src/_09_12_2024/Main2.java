//package _09_12_2024;
//
//import com.github.javafaker.Faker;
//
//import java.util.Random;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Employee[] employees = new Employee[10];
//        Random random = new Random();
//        Faker faker = new Faker();
//
//        for (int i = 0; i < employees.length; i++) {
//            employees[i] = new Employee(i+1,
//                    faker.name().firstName(),
//                    faker.commerce().department(),
//                    random.nextDouble()  * random.nextInt(10_000)
//                    );
//        }
//
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
//        }
//    }
//}
