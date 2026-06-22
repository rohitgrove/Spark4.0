package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name +
                '\'' + ", id=" + id +
                ", course='" + course +
                '\'' + '}';
    }
}

public class CustomList {
    public static void main() {
        Student s1 = new Student("Arjun", 1, "java");
        Student s2 = new Student("Abhishek", 2, "DSA");
        Student s3 = new Student("Nilesh", 3, "DevOps");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);
    }
}
