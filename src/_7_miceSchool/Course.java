package _7_miceSchool;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */


public class Course {

    private String name = new String();
    private Student[] students = new Student[10];
    static int seatNumber = 0;

    public boolean register(Student s) {
        if (seatNumber != 9) {
            this.students[seatNumber] = s;
            return true;
        } else
            return false;
    }

    public int getNumOfStudents() {
        return seatNumber + 1;
    }

    public Student[] getStudents() {
        Student[] registeredStudents = new Student[seatNumber];
        for (int i = 0; i <= seatNumber; i++) {
            registeredStudents[i] = students[i];
        }
        return registeredStudents;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


