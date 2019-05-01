package basics.genericsandwildcards;

import java.util.ArrayList;

class Machine{
    public String toString(){
        return "I am a Machine";
    }
    public void Start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine{
    @Override
    public String toString(){
        return "I am a Camera";
    }
    public void snap(){
        System.out.println("snapped");
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Machine> someList = new ArrayList<>();
        someList.add(new Machine());
        someList.add(new Machine());
        showList(someList);

        ArrayList<Camera> someList2 = new ArrayList<Camera>();
        someList2.add(new Camera());
        someList2.add(new Camera());
        showList(someList2);
        showList2(someList2);
        showList3(someList2);
    }

    //Upcasting
    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.Start();
        }
    }

    //Downcasting again you will have to treat Object.
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    //Wildcard
    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}
