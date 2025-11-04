package structural.composite;

public class DisplayCourses {
    public static void main(String[] args) {
        //instantiate each sub concentration through the composite concentration as well as the department
        ConcentrationComposite proceduralLanguages =
                new ConcentrationComposite ("Procedural Languages");
        ConcentrationComposite objectOrientedLanguages =
                new ConcentrationComposite ("Object Oriented Languages");
        ConcentrationComposite functionalLanguages =
                new ConcentrationComposite ("Functional Languages");
        ConcentrationComposite programmingLanguages =
                new ConcentrationComposite ("Programming Languages");
        ConcentrationComposite department =
                new ConcentrationComposite ("Computer Science Department");


        //add individual courses to each sub concentration
        proceduralLanguages.add(new Course("Introduction to Computer Science"));
        proceduralLanguages.add(new Course("Programming Languages"));
        objectOrientedLanguages.add(new Course("Java Programming"));
        objectOrientedLanguages.add(new Course("Python Programming"));
        functionalLanguages.add(new Course("Haskell"));
        functionalLanguages.add(new Course("JavaScript"));

        //add the sub-concentration to the composite concentration
        programmingLanguages.add(proceduralLanguages);
        programmingLanguages.add(objectOrientedLanguages);
        programmingLanguages.add(functionalLanguages);

        //add the concentration to the department
        department.add(programmingLanguages);

        System.out.println("\n--Testing concentrations in the Computer Science Department--");
        programmingLanguages.display();

    }
}
