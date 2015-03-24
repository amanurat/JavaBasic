package com.training.annonymous;

/**
 * Created by amanurat on 3/20/15 AD.
 */
public class MouseTest {

    public static void main(String[] args) {

        Mouse mouse = new Mouse(){
            @Override
            public void click() {
                System.out.println("I am click mouse...");
            }
        };

        mouse.click();


        DoubleClick doubleClick = new DoubleClick() {
            @Override
            public void doubleClick() {
                System.out.println("I am double click mouse...");
            }
        };

        doubleClick.doubleClick();





    }

}
