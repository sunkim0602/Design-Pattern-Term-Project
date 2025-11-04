package behavioral.strategy;
import java.util.List;

public abstract class GPATypes {
    CalculationMethods calculationMethods;
    public GPATypes() {}
    //use one of the calculation methods to calculate the GPA
    public void showMethod(List<String> grades) {
        double gpa = calculationMethods.applyCalculation(grades);
        System.out.println("GPA: " + gpa);
    }
    public abstract void showMe();

    //Set the corresponding calculation algorithm to the type of GPA
    public void setMethod (CalculationMethods calculationMethods) {this.calculationMethods = calculationMethods;}

}
