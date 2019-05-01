package basics.anonymusclass;

class Machine{
    public void start(){
        System.out.println("Machine Started.");
    }
}

interface Plant{
    public void grow();
}

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine() {
            @Override public void start(){ System.out.println("Camera Started.");}
        };
        mach1.start();

        Plant plant = new Plant(){
            @Override
            public void grow() {
                System.out.println("Plant Growing");
            }
        };
        plant.grow();
    }
}
