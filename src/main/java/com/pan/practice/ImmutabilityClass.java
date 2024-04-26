package com.pan.practice;

class Test {

    private int i;
    Test(int i) {
        this.i = i;
    }

    public Test modify(int j) {
        if(i==j) {
            return this; // return current object
        }
        else {
            return new Test(j); // Create New Object with these new changes
        }
    }
}
public class ImmutabilityClass {

    public static void main(String[] args) {

        Test t1 = new Test(10);
        Test t2 = t1.modify(100);
        Test t3 = t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
