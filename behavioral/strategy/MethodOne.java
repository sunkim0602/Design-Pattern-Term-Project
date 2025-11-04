package behavioral.strategy;
import java.util.List;

public class MethodOne extends CalculationMethods {

    public double applyCalculation (List<String> grades) {
        //initialize total grade points
        int totalPoints = 0;
        //iterate through each grade and add the matching numerical value to totalPoints
        for (String grade : grades) {
            totalPoints += gradePoints.getOrDefault(grade, 0);
        }

        double numericGrade = (double) totalPoints / grades.size();

        //determine whether it is a pass or fail grade
        if (numericGrade >= 3.0) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        return numericGrade;
    }
}
