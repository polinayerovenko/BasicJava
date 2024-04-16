package lab3.controller;

import lab3.Creator;
import lab3.model.*;

public class DefaultCompCreat implements Creator{
    public UniComponent creatUni(String name){
        return new Uni(name);
    }
    public Faculty creatFaculty(String name, Human head){
        return new Faculty (name, head);
    }
    public UniComponent creatDepart(String name, Human head){
        return new Depart(name, head);
    }
    public Student creatStudent(String firstName, String lastName, String patrom, Sex sex, Group group){
        return new Student(firstName, lastName, patrom, sex, group);
    }
}
