package Transport;

public class Main {
    static void main() {
         Car c = new Car("Maruti", "800", 4, 5, "Automatic");
         c.startEngine();
         c.startAC();
         c.stopEngine();
         System.out.println(c.name);

        // MotorCycle m = new MotorCycle("Splendor", "Xline", 2, "U", "Soft");
        // m.startEngine();
        // m.wheelie();
        // m.stopEngine();

    }
}
