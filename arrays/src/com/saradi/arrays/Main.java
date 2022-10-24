package com.saradi.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] students = new String[5];
//
//        students[1] = "Alex";
//
//        students[0] = "Sarah";
//        students[2] = "Tom";
//        students[3] = "Brad";
//        students[4] = "Madelin";
//
//        System.out.println(students[2]);
//
//        String[] employees = {"Manu", "Anitha", "Raju"};
//
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//
////        for(int i =0; i< 6; i++)
//        for(int i =0; i< numbers.length; i++)
//        {
//            System.out.println(numbers[i]);
//        }


        String[] names = {"Ram", "Rahim", "Sita", "Mahima", "Govinda"};
        int[] numbers = {122313, 123123, 456789, 987654, 136808};


        for(int i =0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i = 0; i < names.length;i++) {
            if (name.equals(names[i]))
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
