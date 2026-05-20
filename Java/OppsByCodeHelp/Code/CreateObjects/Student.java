public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default ctor // attr. -> garbagee
    public Student() {
        System.out.println("Student Default ctor Called");
    }

    // Parameter ctor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Student Parameterized ctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // copy ctor
    public Student(Student srcObj) {
        System.out.println("Student copy ctor Called");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    // methods / Behaviours
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }
}
