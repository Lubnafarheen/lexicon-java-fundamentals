package org.lubna.fundamentals.week5.inheritance.model;

import java.util.Arrays;

public class Student extends Person {
    public static final int MAX_COURSES = 4;

    private int studentId;
    private String[] courses;

    public Student(int studentId, String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
        this.studentId = studentId;
    }

    public void registerCourse(String course) {
        if (courses == null) courses = new String[0];
        if (courses.length > MAX_COURSES)
            throw new IllegalArgumentException("You are eligible to enroll for only a maximum of 5 courses!");
        String[] temp = Arrays.copyOf(courses, courses.length + 1);
        temp[temp.length - 1] = course;
        courses = temp;
    }

    public String courseInformation() {
        if (courses == null || courses.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String course : courses) {
            stringBuilder.append(course).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String getFullName() {
        return "FullName: " + getFirstName() + "" + getLastName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public String getInformation() {
        return "StudentId: " + studentId + getFullName();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
