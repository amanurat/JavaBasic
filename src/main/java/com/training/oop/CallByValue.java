package com.training.oop;

/**
 * Created by amanurat on 3/11/15 AD.
 */
public class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}

// Primitive types are passed by value.
class Test {
    /* This method causes no change to the arguments
       used in the call. */
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }

    public Test() {

    }

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    /* Pass an object. Now, ob.a and ob.b in object
       used in the call will be changed. */
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}