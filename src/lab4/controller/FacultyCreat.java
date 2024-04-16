package lab4.controller;

import lab4.model.Faculty;
import lab4.model.Human;

public class FacultyCreat {
    public Faculty createFaculty(String name, Human head){
        return new Faculty(name,head);
    }
}