package basics.interfaces;

class Person implements Info{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet (){
        System.out.println("Hello there." + name);
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is" + name);
    }
}
