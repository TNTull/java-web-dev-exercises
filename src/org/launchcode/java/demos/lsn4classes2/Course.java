//Teresa Tull worked on this on 9-25-2022 Java ch 4 exercises

package org.launchcode.java.demos.lsn4classes2;

import exercisesCh4.school.Student;
import exercisesCh4.school.Teacher;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String courseName;
    private int courseNumber;
    private String topic;
    private exercisesCh4.school.Teacher instructor;
    private ArrayList<exercisesCh4.school.Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        String courseReport = String.format("%s is number %d of %s and " +
                        "is taught by %s.", this.courseName, this.courseNumber,
                this.topic, this.instructor);
        return courseReport;
    }


        // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null) return false;
        if (toBeCompared.getClass() != getClass()) return false;
        Course theCourse = (Course) toBeCompared;
        return theCourse.courseName == courseName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }

    public Course(String courseName, String topic,
                  exercisesCh4.school.Teacher instructor, int courseNumber) {
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(exercisesCh4.school.Teacher instructor) {
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

    public void setEnrolledStudents(ArrayList<exercisesCh4.school.Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

}
