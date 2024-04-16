package lab3;

import lab3.model.*;

public interface Creator {
    Student creatStudent(String firstName, String lastName,String patrom, Sex sex, Group group);
    UniComponent creatUni (String name);
    Faculty creatFaculty(String name, Human head);
    UniComponent creatDepart(String name, Human head);
}
