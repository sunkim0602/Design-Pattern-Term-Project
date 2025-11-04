package structural.decorator;

//Thesis Decorator
public class ThesisDecorator extends StudentDecorator {
    private String thesisTitle;
    private String advisor;
    
    public ThesisDecorator(Student student, String thesisTitle, String advisor){
        super(student);
        this.thesisTitle = thesisTitle;
        this.advisor = advisor;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() +
                "\nThesis title: " + thesisTitle +
                "\nAdvisor: " + advisor;
    }
}
