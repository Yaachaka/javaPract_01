package com.saradi.loops;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int a = 5;
//        for(int i = 0; i < a; i++)
//        {
////            System.out.println("Hello");
//            System.out.println(i);
//
//        }

//        while(a < 10)
//        {
//            a++;
//            if(a == 8)
//            {
//                continue;
//            }
//            System.out.println("Hello");
//
////            break;
//
//        }
//
//        do {
//            System.out.println("Hello");
//        }while(a < 5);

//        System.out.println("Please enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: "+answer);
//
//        System.out.println("Enter your name: ");
//        String name = scanner.next();
//        System.out.println("Hello "+name);

//        Random random = new Random();
//        int number = random.nextInt();
//        System.out.println("Generated random number: "+number);

        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println("Generated random number: "+number);

    }
}
