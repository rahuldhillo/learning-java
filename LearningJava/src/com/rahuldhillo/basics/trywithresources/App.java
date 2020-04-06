package com.rahuldhillo.basics.trywithresources;

class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("closing...");//close is always called.
        throw new Exception("Oh no!");
    }
}

public class App {
    public static void main(String[] args) {
        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*try {                         //Instead of doing this, use try with resources. See above.
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
