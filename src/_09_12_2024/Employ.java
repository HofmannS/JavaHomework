package _09_12_2024;

public class Employ {
    int id;
    String name;
    String department;
    double salary;

    public Employ(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employ() {
    }

    public String convertSalaryToString(double salary) {
        return "{ " + salary + " }";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}