package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("ClassGroup container for Student objects");

        ClassGroup groupA = new ClassGroup("SD2a");

        groupA.add( new Student("Kevin",18));
        groupA.add( new Student ("Martin", 21));
        groupA.add( new Student( "Laura", 18));

        int numStudents = groupA.size();
        System.out.println("Number of students = " + numStudents);

        String name = "Laura";
        Student student = groupA.findStudentByName( name );
        if(student!=null)
            System.out.println(student.toString());
        else
            System.out.println("Student " + name + " was not found");

        int age = 18;
        ArrayList<Student> sameAgeList = groupA.findStudentsByAge(age);
        if(sameAgeList.isEmpty())
            System.out.println("There are no students of age " + age);
        else{
            for(Student s : sameAgeList)
                System.out.println(s);
        }


    }
}
