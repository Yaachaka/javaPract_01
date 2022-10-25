package com.saradi.oopsection2;

public class Main {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Kogile", "Black", 2, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("Meat");
        System.out.println(phoenix.getWings());
        phoenix.fly();
        phoenix.fly(80);

    }
}
