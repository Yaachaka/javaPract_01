package com.saradi.oopsetion1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 5, 8, 8);
        iPhone.setName("iPhone 11");
        System.out.println(iPhone.getName());

        iPhone.setMemorySize(8);

        iPhone.playMusic("Singaara Siriye");
        iPhone.playMusic("Bidalaare endu ninna");

        Phone pixel = new Phone("Pixel 3", 8);
    }
}
