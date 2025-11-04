package behavioral.strategy;
import java.util.List;

public class MethodThree extends CalculationMethods {

    public double applyCalculation (List<String> grades) {
        //initialize total grade points
        int totalPoints = 0;
        //iterate through each grade and add the matching numerical value to totalPoints
        for (String grade : grades) {
            totalPoints += gradePoints.getOrDefault(grade, 0);
        }

        //add them together and divide by the number of grades to get the standard GPA
        return (double) totalPoints / grades.size();

    }
}
