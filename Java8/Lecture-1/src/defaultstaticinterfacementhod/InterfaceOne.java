package defaultstaticinterfacementhod;

public interface InterfaceOne {
    // abstract methods/ Non-implemented methods
    void printNames();

    String getNames();

    // Trying To Define Implementation methods
    // static void printData1() {
        // logic
    // }

    // how to create default methods
    default void defaultMethodOne() {
        // logic
        System.out.println("Inside defaultMethodOne.. ");
    }

    default String defaultMethodTwo() {
        // logic
        System.out.println("Inside defaultMethodTwo.. ");
        return "Default Method Two";
    }
}
