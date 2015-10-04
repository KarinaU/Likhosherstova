package com.box;

/**
 * Created by IT_School on 04.10.2015.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.height = 15;
        mybox.weidth = 20;

        vol = mybox.weidth * mybox.height * mybox.depth;
        System.out.println("Объем = " + vol);
    }
}
