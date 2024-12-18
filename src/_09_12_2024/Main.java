package _09_12_2024;

public class Main {
    public static void main(String[] args) {
        Employ emp = new Employ();
        Employ emp1 = new Employ();
        int x = 9;

        emp.id = 1;
        emp.department = "IT";
        emp.name = "Mike";
        emp.salary = 3223.34;

        emp1.id = 2;
        emp1.department = "HR";
        emp1.name = "Nik";
        emp1.salary = 1983.34;

        System.out.println(emp1.convertSalaryToString(emp1.salary));
    }
}