package org.example;
import java.util.ArrayList;

/**
 * ClassGroup represents a class group e.g. SD2A, or SD2b.
 * What attributes would a group have?
 *  - it needs a name to store "SD2A" etc.
 *  - it needs to store a list of students -
 *  -   so we can use an ArrayList to store Student type objects
 *
 *  This is a Container class, as it acts a container to store a list of Student objects
 */
public class ClassGroup {
    private String name; // name of the class group e.g. "SD2a"
    private ArrayList<Student> studentList; // reference to the student list
    public ClassGroup(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();  // create the ArrayList object
    }

    // access to student list is possible only by calling the
    // methods provided below.

    // The add method accepts a Reference to a Student object.
    // We add this reference (object) to the ArrayList.
    public void add(Student student) {
        studentList.add( student );
    }

    // Search through the students list to find a match for the name
    // passed in as an argument
    public Student findStudentByName(String name) {
        for(Student student : studentList)
            if(name.equals(student.getName()))  // compare names
                return student;   // return reference to the matched student

        return null; // indicates that no matching student was found
    }

    // Search for ALL students that are of a certain age.
    // Note that we need to return a List, but the list may be empty

    public ArrayList<Student> findStudentsByAge( int age ) {
        ArrayList<Student> list = new ArrayList<>(); // create new empty arraylist
        for(Student student : studentList){
            if(age == student.getAge());  // compare on age
                list.add(student);   // return reference to the matched student
        }
        return list;
    }

    // TODO Write the method findAllStudentsUnderAge( int age );

    // TODO Write the method findAllTeenagers()

    public ArrayList<Student> getStudentsList() {
        return this.studentList;

        // ArrayList<String> temp = new ArrayList<>( this.studentsList);  // clone
        // return temp;
        // returns a clone of the arraylist (so not to leak out the reference)
    }

    public int size() {
        return studentList.size();
    }

}
