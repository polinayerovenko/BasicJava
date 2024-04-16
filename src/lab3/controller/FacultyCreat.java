package lab3.controller;

import lab3.model.Faculty;
import lab3.model.Human;

public class FacultyCreat {
    public Faculty creatFaculty(String name, Human head){
        return new Faculty(name,head);
    }
}
