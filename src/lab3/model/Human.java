package lab3.model;

public class Human {
    protected String firstName;
    protected String lastName;
    protected String patrom;
    protected Sex sex;

    public Human(String firstName, String lastName, String patrom, Sex sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patrom = patrom;
        this.sex = sex;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPatrom(){
        return patrom;
    }
    public Sex getSex(){
        return sex;
    }
}
