package com.rahuldhillo.basicstwo;

public class Box {
    private int length, breadth, height;

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.showDimension();
    }
}
