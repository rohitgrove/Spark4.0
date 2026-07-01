import FunctionalInterfaceDemo.Calculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee rahul = new Employee("Rahul", "IT", 29, 50000);
        Employee Amit = new Employee("Amit", "HR", 35, 40000);
        Employee Ankit = new Employee("Ankit", "HM", 32, 90000);
        Employee riya = new Employee("Riya", "IT", 24, 70000);

        List<Employee> employees = new ArrayList<>();
        employees.add(rahul);
        employees.add(Amit);
        employees.add(Ankit);
        employees.add(riya);

        System.out.println("Filter by Salaray greater > 50000");
        for (Employee e : employees) {
            if (e.getSalary() > 50000) {
                System.out.println(e);
            }
        }

        System.out.println("Filter by department is IT");
        for (Employee e : employees) {
            if (e.getDepartment().equals("IT")) {
                System.out.println(e);
            }
        }

        System.out.println("Filter by age greater > 30");
        for (Employee e : employees) {
            if (e.getAge() > 30) {
                System.out.println(e);
            }
        }

        // Java Before java 8
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getSalary() - o2.getSalary());
            }
        });

        // Java 8
        employees.sort((a, b) -> a.getSalary() - b.getSalary());

        // Yahan Lambda Calculator interface ka implementation hai.
        Calculator c = (a,b) -> a+b;
    }
}
