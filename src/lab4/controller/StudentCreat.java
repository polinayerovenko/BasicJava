package lab4.controller;


import lab4.model.Group;
import lab4.model.Student;
import lab4.model.Sex;

public class StudentCreat {
    public Student creatStudent(String firstName, String lastName, String patrom, Sex sex, Group group){
        return new Student(firstName, lastName, patrom, sex, group);
    }
}
