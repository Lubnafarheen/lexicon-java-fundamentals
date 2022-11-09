package org.lubna.fundamentals.week5.inheritance.model;

public class Teacher extends Person{

    private int teacherId;

    public Teacher(int teacherId, String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
        this.teacherId = teacherId;
    }

    @Override
    public String getInformation() {
        return "TeacherId: " + getTeacherId();
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
