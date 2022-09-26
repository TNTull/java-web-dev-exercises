package exercisesCh4.school;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseName;
    private String topic;
    private Teacher instructor;
    private int courseNumber;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, String courseTopic,
                  Teacher instructor, int courseNumber) {
        this.courseName = courseName;
        this.topic = topic;
        this.instructor = instructor;
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTopic() {
        return courseTopic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
