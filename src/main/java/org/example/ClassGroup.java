package org.example;
import java.util.ArrayList;
public class ClassGroup {
    private String name; // name of the class
    private ArrayList<String> studentsList; // list of students in the class
    public ClassGroup(String name) {
        this.name = name;
        this.studentsList = new ArrayList<>();  // create the ArrayList object
    }
    // access to students is possible only by calling the
    // methods provided below.
    public void add(String name) {
        studentsList.add( name );
    }
    public ArrayList<String> getStudentsList() {
        return this.studentsList;
        // ArrayList<String> temp = new ArrayList<>( this.studentsList);  // clone
        // return temp;

        // returns a clone of the arraylist (so not to leak out the reference)
    }

    public int size() {
        return studentsList.size();
    }


}
