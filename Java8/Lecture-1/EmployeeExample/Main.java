import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee rahul = new Employee("Rahul", "IT", 40000, 25);
        Employee amit = new Employee("Amit", "HR", 90000, 40);
        Employee riya = new Employee("Riya", "IT", 60000, 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(rahul);
        employees.add(amit);
        employees.add(riya);

        // Java 7
        System.out.println("Filter on salary greater then 50000");
        for (Employee e : employees) {
            if (e.getSalary() > 50000) {
                System.out.println(e);
            }
        }

        System.out.println("department of it");
        for (Employee e : employees) {
            if (e.getDepartment().equals("IT")) {
                System.out.println(e);
            }
        }

        System.out.println("Filter on salary age then 30");
        for (Employee e : employees) {
            if (e.getAge() > 30) {
                System.out.println(e);
            }
        }

        System.out.println("Filter on salary greater then 70000");
        for (Employee e : employees) {
            if (e.getSalary() > 70000) {
                System.out.println(e);
            }
        }

        // Java 8
        List<Employee> emp = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());

        // Before Java 8
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.getSalary() - b.getSalary();
            }
        });

        // Java 8
        employees.sort((a, b) -> a.getSalary() - b.getSalary());
    }
}
