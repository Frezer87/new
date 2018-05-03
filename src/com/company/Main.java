package com.company;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person emily = new Person();
        emily.setName("Emily");
        System.out.println(emily.getName());
        System.out.println(emily.toString());

        Employee francesca = new Employee();
        francesca.setName("Francesca");
        francesca.setEmployeeId(1);
        System.out.println(francesca.getName());
        System.out.println(francesca.getEmployeeId());
        System.out.println(francesca.toString());

        //francesca = emily;
        emily = francesca;
        emily.setName("Emily");
        //emily.setEmployeeId(2);
        System.out.println(emily.getName());
        System.out.println(francesca.getName());
        System.out.println(emily.toString());

        Student samantha = new Student();
        samantha.setName("Samantha");
        samantha.setStudentId(2);
        System.out.println(samantha.toString());

        Student frezer = new Student();
        frezer.setName("Frezer");
        frezer.setStudentId(2);

        System.out.println("");
        if (samantha .equals(frezer)){
            System.out.println(" Id is the same");
        }else
        System.out.println("Id is not  the same");

        System.out.println("");


        Faculty anne = new Faculty();
        anne.setName("Anne");
        anne.setEmployeeId(5);
        anne.setDepartment("CSC");
        System.out.println(anne.toString());

        //samanatha = anne;
        //anne = samantha;
        emily = samantha;
        francesca = anne;

        Faculty profAhmad = new Faculty("Anwar Ahmad", 3, "CSC");


    }


}