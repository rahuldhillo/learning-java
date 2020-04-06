package com.rahuldhillo.basics.interfaces;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        Person per1 = new Person (" BoB");
        per1.greet();
        Info info1 = new Machine ();
        info1.showInfo();
        Info info2 = per1;
        info2.showInfo();

        outInfo(mach1);
        outInfo(per1);
    }

    public static void outInfo (Info info){
        info.showInfo();
    }
}
