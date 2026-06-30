public class Employee {
    private String name;
    private String department;
    private int age;
    private int salary;

    public Employee(String name, String department, int age, int salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + name + "'" +
                ", department='" + department + "'" +
                ", age='" + age + "'" +
                ", salary='" + salary + "'" +
                "}";
    }
}