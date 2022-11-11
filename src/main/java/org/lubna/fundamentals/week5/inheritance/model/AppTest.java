package org.lubna.fundamentals.week5.inheritance.model;

import org.lubna.fundamentals.week5.inheritance.data.StudentRepository;
import org.lubna.fundamentals.week5.inheritance.model.Gender;
import org.lubna.fundamentals.week5.inheritance.model.Student;

public class AppTest {
    public static void main(String[] args) {

        Student anna = new Student(1, "Anna", "Bergen", 25, Gender.FEMALE);
        Student henry = new Student(2, "Henry", "Johnson", 30, Gender.MALE);
        StudentRepository studentRepository = new StudentRepository();

        studentRepository.add(anna);
        System.out.println(studentRepository.getSize());

        studentRepository.add(henry);
        System.out.println(studentRepository.getSize());
    }
}
