package com.company;

public class Student extends Person {
    //instance variables
    private int studentId;

    //default constructor
    public Student() {
        super(); //call to default constructor of the parent class (Person)
        studentId = 0;
    }

    public Student(String studentName) {
        super(studentName);
        studentId = 0;
    }

    public Student(String studentName, int newStudentId) {
        super(studentName);
        setStudentId(newStudentId);
    }

    public Student(int newStudentId) {
        super();
        setStudentId(newStudentId);
    }


    //non-static method
    public void setStudentId(int newStudentId) {
        if(newStudentId > 0) {
            studentId = newStudentId;
        }
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return getName()+ " Student Id is " + studentId ;
    }

    @Override
    public boolean equals(Object newObject) {
        if (this == newObject) return true;
        if (!(newObject instanceof Student)) return false;

        Student student = (Student) newObject;

        return getStudentId() == student.getStudentId();
    }

}