package com.saradi.static_inner;

public class TestClass {
    public static String name;
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public static void printSomething()
    {
        System.out.println("Printing...");
        //printIt();//non-static method cannot be referenced from static context.
        //System.out.println(age);//non-static field cannot be referenced from static context.
    }

    public void printIt()
    {

    }
}
