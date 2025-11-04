package structural.decorator;

//Base Decorator
public abstract class StudentDecorator implements Student {
    protected Student student;

    public StudentDecorator (Student student){
        this.student = student;
    }

    public String getDetails(){
        return student.getDetails();
    }
}
