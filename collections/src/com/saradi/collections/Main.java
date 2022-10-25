package com.saradi.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        String[] names = {"Ram", "Rahim", "Arjuna", "Krishna", "Bheema"};
//
//        System.out.println(names[2]);
//
////        names[5] = "Dharma";
//
//        String[] newNames = new String[6];
//
//        for(int i=0; i<names.length; i++)
//        {
//            newNames[i] = names[i];
//        }
//
//        newNames[5] = "Dharma";
//
//        System.out.println(newNames[5]);
//
//    }     String[] name = new String[5];


        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> names = new ArrayList<>();
//        ArrayList<Float> names = new ArrayList<>();
//        ArrayList<Double> names = new ArrayList<>();
        List<String> student = new ArrayList<>();

        names.add("Sita");
        names.add("Lakshmi");
//
//        System.out.println(names.get(0));
//        System.out.println(names.size());
//        names.remove(0);
//        System.out.println(names.get(0));
//        System.out.println(names.size());
//        System.out.println(names.contains("Sita"));
//        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names.size());

//        System.out.println(names.indexOf("Kothi"));

//        for(int i =0; i<names.size();i++)
//        {
//            System.out.println(names.get(i));
//        }

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Sita", "sitaRam@gmail.com");
        emailList.put("Ram", "ramm@gmail.com");
        System.out.println(emailList.get("Sita"));
        System.out.println(emailList.size());
        emailList.remove("Ram");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Ram"));
        System.out.println(emailList.containsValue("sitaRam@gmail.com"));


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Lava", 15));
        students.add(new Student("Kusha", 16));

        for(Student s: students)
        {
            System.out.println(s.getName());
        }
    }
}
