import java.util.ArrayList;

public class Student {

    private String name;


    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String name) {
        this.name = name;

    }

    public void addCourse(Course C) {
        courses.add(C);
    }

    public String toString() {
        return ("name of the Student is" + name + "Subject of the student is" + courses);
    }

}
