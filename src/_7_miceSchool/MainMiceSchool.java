package _7_miceSchool;

/**
 * Created by sinet on 3/9/2019.
 */
public class MainMiceSchool {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Physic");

        Student student = new Student("Hamidreza", 30);
        course.register(student);

       System.out.println( course.getNumOfStudents());
    }
}
