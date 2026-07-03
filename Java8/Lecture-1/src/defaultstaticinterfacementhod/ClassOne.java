package defaultstaticinterfacementhod;

public class ClassOne implements InterfaceOne {

    @Override
    public void printNames() {
        System.out.println("printing Name");
    }

    @Override
    public String getNames() {
        // Accessing default method from own method
        defaultMethodOne();
        System.out.println("getting names");
        return "default method";
    }

    public void defaultMethodOne() {
        System.out.println("Inside ClassOne Default Method One");
    }
}
