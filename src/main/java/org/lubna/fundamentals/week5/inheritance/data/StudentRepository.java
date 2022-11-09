package org.lubna.fundamentals.week5.inheritance.data;

import org.lubna.fundamentals.week5.inheritance.model.Student;

import java.util.Arrays;

public class StudentRepository implements IStudentRepository {
    private Student[] students = new Student[0];

    @Override
    public int getSize() {
        return students.length;
    }

    @Override
    public void clear() {
        students = new Student[0];
    }

    @Override
    public Student[] findAll() {
        return Arrays.copyOf(students, students.length);
    }

    @Override
    public Student findByStudentId(int studentId) {
        for (Student studentElement : students) {
            if (studentElement.getStudentId() == studentId) {
                return studentElement;
            }
        }
        return null;
    }

    @Override
    public boolean add(Student student) {
        Student result = findByStudentId(student.getStudentId());
        if (result != null) {
            return false;
        }

        students = addToArray(student);
        return true;
    }

    private Student[] addToArray(Student student) {
        Student[] temp = Arrays.copyOf(students, students.length+1);
        temp[temp.length - 1] = student;
        return temp;
    }
}
