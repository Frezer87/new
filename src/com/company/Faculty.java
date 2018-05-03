package com.company;

    public class Faculty extends Employee {
        //instance variables
        private String department;

        //default constructor
        public Faculty() {
            super(); //call the default constructor of the parent class (Employee)
            department = "";
        }

        public Faculty(String facultyName) {
            super(facultyName);
            department = "";
        }

        public Faculty(String facultyName, int newEmployeeId) {
            super(facultyName,newEmployeeId);
        }

        public Faculty(String facultyName, int newEmployeeId, String newDepartment) {
            super(facultyName,newEmployeeId);
            setDepartment(newDepartment);
        }


        //non-static methods
        public void setDepartment(String newDepartment) {
            department = newDepartment;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Faculty{" + "department='" + department + '\'' + '}';
        }
    }
