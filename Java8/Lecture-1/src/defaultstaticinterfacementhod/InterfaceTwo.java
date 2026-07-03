package defaultstaticinterfacementhod;

public interface InterfaceTwo {
    default void defaultMethodThree() {
        // logic
        System.out.println("Inside InterfaceTwo : Inside defaultMethodThree.. ");
    }
}
