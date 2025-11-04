package structural.decorator;

//Program Decorator
public class ProgramDecorator extends StudentDecorator {
    private String program;

    public ProgramDecorator(Student student, String program){
        super(student);
        this.program = program;
    }
    @Override
    public String getDetails(){
        return super.getDetails() +"\nProgram: "+program;
    }
}
