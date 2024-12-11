package _09_12_2024;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        String[] names = {"Nik", "Mik"};
        String[] deps = {"IT", "HR"};

        Random random = new Random();

        Employee e1  = new Employee(1, names[0], deps[0], random.nextDouble());
        Employee e2  = new Employee(2, names[1], deps[1], random.nextDouble());

        Employee[] employees = {e1, e2};

        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if(currentEmployee.salary < 10) {
                System.out.println(currentEmployee.name + " : " + currentEmployee.salary);
            }
        }
    }
}
