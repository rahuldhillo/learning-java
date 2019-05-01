package basics.interfaces;

class Client implements Callback {
    public void callback (int p){
        System.out.println("callback called with " +p);
    }

    void nonIfceMeth (){
        System.out.println("I am not in Ifce");
    }
}
