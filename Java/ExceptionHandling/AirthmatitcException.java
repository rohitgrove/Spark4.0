public class AirthmatitcException{
    public static void main(String[] args) {
            System.out.println("Before exception");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
            System.out.println("After exception");
    }
}