package _7_miceSchool;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */


public class Student {

    private String firstName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

