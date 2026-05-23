public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // overloading add, 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // overloading add, 3 integers, 4 doubles
    public double add(int a, int b, int c, double  d) {
        return a + b + c + d;
    }
}
