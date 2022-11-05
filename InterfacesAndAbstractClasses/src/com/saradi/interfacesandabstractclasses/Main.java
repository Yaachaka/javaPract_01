package com.saradi.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CarInterface carInterface = new ElectricCar("Tesla");
//        carInterface.start();
//        carInterface.move(60);
//
////        List<String> name = new ArrayList<>();
//
//        CarInterface fossilFuelcar = new FossilFuelCar("Mercedes");
//        fossilFuelcar.start();
//        fossilFuelcar.move(100);

        TestAbstractClass testAbstractClass = new TestClass();
        testAbstractClass.printName("Ram");

    }
}
