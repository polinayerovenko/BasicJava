package lab3.controller;

import lab3.model.Group;
import lab3.model.Student;
import lab3.model.Sex;

public class StudentCreat {
    public Student creatStudent(String firstName, String lastName, String patrom, Sex sex, Group group){
        return new Student(firstName, lastName, patrom, sex, group);
    }
}
