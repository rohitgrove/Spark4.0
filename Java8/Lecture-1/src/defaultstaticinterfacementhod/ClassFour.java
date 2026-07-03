package defaultstaticinterfacementhod;

public class ClassFour implements InterfaceOne{
    @Override
    public void printNames() {
        System.out.println("printing Name");
    }

    @Override
    public String getNames() {
        System.out.println("getting names");
        return "default method";
    }
}
