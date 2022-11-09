package org.lubna.fundamentals.week5.inheritance.data;

import org.lubna.fundamentals.week5.inheritance.model.Student;

public interface IStudentRepository extends IBaseRepository{

    int MAX_STUDENTS = 9999;

    Student[] findAll();

    Student findByStudentId(int studentId);

    boolean add(Student student);

}
