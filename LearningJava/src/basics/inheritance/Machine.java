package basics.inheritance;

public class Machine {
    private String name = "This is machine 1";
    protected String name2 = "This is protected";

    public void start(){
        System.out.println("Machine started");
    }

    public void stop(){
        System.out.println("Machine Stopped");
    }
}
