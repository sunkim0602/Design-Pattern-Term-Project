package structural.decorator;

//Concrete Component
public class BasicStudent implements Student {
    private String name;

    public BasicStudent(String name){
        this.name = name;

    }

    @Override
    public String getDetails(){return "Student: "+name;}

}
