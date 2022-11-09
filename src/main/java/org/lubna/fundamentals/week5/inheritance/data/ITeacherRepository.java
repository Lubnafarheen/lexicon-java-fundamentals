package org.lubna.fundamentals.week5.inheritance.data;

import org.lubna.fundamentals.week5.inheritance.model.Teacher;

public interface ITeacherRepository extends IBaseRepository {

    int MAX_TEACHERS = 9;

    Teacher[] findAll();
}
