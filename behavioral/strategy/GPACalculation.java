package behavioral.strategy;
import java.util.Arrays;
import java.util.List;

public class GPACalculation {
    public static void main(String[] args) {
        List<String> grades = Arrays.asList("A", "A", "B", "B");
        List <Integer> credits = Arrays.asList(4, 4, 6, 6);

        //calculate GPA using the standard method
        GPATypes standardGPA = new NumericConversion();
        standardGPA.setMethod(new MethodThree());
        standardGPA.showMe();
        standardGPA.showMethod(grades);

        //calculate GPA using the weighted method
        GPATypes weightedGPA = new WeightedGPA();
        weightedGPA.setMethod(new MethodTwo (grades, credits));
        weightedGPA.showMe();
        weightedGPA.showMethod(grades);

        //calculate the grade using the pass/fail grading method
        GPATypes passOrFail = new PassOrFail();
        passOrFail.setMethod(new MethodOne());
        passOrFail.showMe();
        passOrFail.showMethod(grades);



    }
}
