package lab4.model;

public abstract class UniComponent {
    private String name;
    private Human head;

    public UniComponent(String name, Human head){
        this.name = name;
        this.head = head;
    }
    public String getName(){
        return name;
    }
    public Human getHead(){
        return head;
    }
}