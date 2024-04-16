package lab3.controller;

import lab3.Creator;
import lab3.model.*;

import javax.swing.*;

public class UniCreat {
    private Creator creator;
    public UniCreat(Creator creator){
        this.creator=creator;
    }
    public Uni createTypicalUni(String name){
        Uni uni = (Uni)creator.creatUni(name);
        Faculty faculty1 = creator.creatFaculty("Information technologies", new Human("Anna", "Ivanova", "Olegivna", Sex.FEMALE));
        uni.addFaculty(faculty1);
        Faculty faculty2 = creator.creatFaculty("Financially economical", new Human("Kirill", "Zaderiy", "Maksimovuch", Sex.MALE));
        uni.addFaculty(faculty2);
        Depart depart1 = (Depart)creator.creatDepart("System analysis and management", new Human("Anna", "Ivanova", "Olegivna", Sex.FEMALE));
        faculty1.addDepart(depart1);
        Depart depart2 = (Depart) creator.creatDepart("Marketing", new Human("Kirill", "Zaderiy", "Maksimovuch", Sex.MALE));
        faculty2.addDepart(depart2);
        Group group1 = new Group("124-20-4");
        Student student1 = (Student) creator.creatStudent("Anna", "Ivanova", "Olegivna", Sex.FEMALE, group1);
        Group group2 = new Group("075-21-2");
        Student student2 = (Student) creator.creatStudent("Kirill", "Zaderiy", "Maksimovuch", Sex.MALE, group2);


        System.out.println("University: " + uni.getName());
        System.out.println("\nFaculty: " + faculty1.getName());
        System.out.println("Department: " + depart1.getName());
        System.out.println(student1.toString());
        System.out.println("\nFaculty: " + faculty2.getName());
        System.out.println(student2.toString());


        return uni;
    }
}
