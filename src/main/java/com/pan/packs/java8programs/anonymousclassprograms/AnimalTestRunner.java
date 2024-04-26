package com.pan.packs.java8programs.anonymousclassprograms;

public class AnimalTestRunner {

    static void perform(Animal animal) {
        animal.run();
    }

    public static void main(String[] args) {
        perform(new Dog());
        perform(() -> System.out.println("Running at 10 Kmph"));

    }
}
