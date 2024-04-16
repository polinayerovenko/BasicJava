package lab4.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty  extends UniComponent {
    private List<Depart> departs;
    public Faculty(String name, Human head){
        super(name, head);
        departs = new ArrayList<>();
    }
    public void addDepart(Depart depart){
        departs.add(depart);
    }
    public List<Depart> getDepart(){
        return  departs;
    }
}
