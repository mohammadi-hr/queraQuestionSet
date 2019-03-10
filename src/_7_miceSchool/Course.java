package _7_miceSchool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */


public class Course {

    private String name = new String();
    private List<Student> students = new ArrayList<Student>();

    public boolean register(Student s) {
        if (students.size() < 10) {
            students.add(s);
            return true;
        } else
            return false;
    }

    public int getNumOfStudents() {
        return students.size() ;
    }

    public Student[] getStudents() {
        Student[] registeredStudents = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            registeredStudents[i] = students.get(i);
        }
        return registeredStudents;
    }

    /*public void printRegisteredStudents(){
        Student[] students = getStudents();
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getFirstName());
        }
    }*/

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


