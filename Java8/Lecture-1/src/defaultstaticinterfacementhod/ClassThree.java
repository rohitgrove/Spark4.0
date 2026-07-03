package defaultstaticinterfacementhod;

public class ClassThree implements InterfaceOne, InterfaceTwo{
    @Override
    public void printNames() {
        System.out.println("Printing name Of class three");
    }

    @Override
    public String getNames() {
        System.out.println("getNames of ClassThree");
        return "";
    }
}
