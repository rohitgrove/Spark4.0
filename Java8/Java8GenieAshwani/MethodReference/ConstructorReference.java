import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Object Created");
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        // Lambda
        Supplier<Student> s1 = () -> new Student();

        s1.get();

        // Constructor Reference
        Supplier<Student> s2 = Student::new;

        s2.get();
    }
}