package basics.abstractclass;

public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("cam started");

    }

    @Override
    public void doStuff() {
        System.out.println("cam stuffing");

    }

    @Override
    public void shutDown() {
        System.out.println("cam shutting");

    }
}
