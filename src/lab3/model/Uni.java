package lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Uni extends UniComponent{
    private List<UniComponent> faculties;
    public Uni(String name){
        super(name, null);
        this.faculties = new ArrayList<>();
    }
    public List<UniComponent> getFacult(){
        return faculties;
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
}
