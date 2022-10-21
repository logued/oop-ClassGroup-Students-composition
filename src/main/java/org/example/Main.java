package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassGroup groupA = new ClassGroup("SD2a");

        groupA.add("Kevin");
        groupA.add("Luana");

        int numStudents = groupA.size();
        System.out.println("Number of students = " + numStudents);

        ArrayList<String> list = groupA.getStudentsList();

        for( String name : list )
            System.out.println(name + ", ");




        //ClassGroup groupB = new ClassGroup("SD2b");


    }
}
