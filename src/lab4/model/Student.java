package lab4.model;

public class Student extends Human {
    private Group group;
    public Student(String firsName, String lastName, String patrom, Sex sex, Group group){
        super(firsName,lastName,patrom,sex);
        this.group = group;
    }
    @Override
    public String toString(){
        return "Student Information: " +
                "\nІм'я: " + getFirstName() + " " + getLastName() +
                "\nПо батькові: " + getPatrom() +
                "\nСтать: " + getSex() +
                "\nГрупа: " + group.getName();
    }
}