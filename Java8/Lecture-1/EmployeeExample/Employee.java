public class Employee {
    public String name;
    public String Department;
    public int Salary;
    public int age;

    public Employee() {
    }

    public Employee(String name, String Department, int Salary, int age) {
        this.name = name;
        this.Department = Department;
        this.Salary = Salary;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", Department='" + getDepartment() + "'" +
                ", Salary='" + getSalary() + "'" +
                ", age='" + getAge() + "'" +
                "}";
    }
}
