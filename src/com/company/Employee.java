package com.company;

public class Employee extends Person {
    //instance variables
    private int employeeId;

    //default constructor
    public Employee() {
        super(); //call the default constructor of my parent class (Person)
        employeeId = 0;
    }

    public Employee(String employeeName) {
        super(employeeName); //call to the constructor that takes a String
        employeeId = 0;
    }

    public Employee(String employeeName, int newEmployeeId) {
        super(employeeName); //call to the constructor that takes a String
        //if(newEmployeeId > 0) {
        //	employeeId = newEmployeeId;
        //}
        setEmployeeId(newEmployeeId);
    }


    //non-static methods
    public void setEmployeeId(int newEmployeeId) {
        if(newEmployeeId > 0) {
            employeeId = newEmployeeId;
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + '}';
    }
}