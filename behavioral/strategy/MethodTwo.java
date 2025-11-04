package behavioral.strategy;
import java.util.List;

public class MethodTwo extends CalculationMethods {

    private List<String> grades;
    private List<Integer> credits;

    public MethodTwo(List<String> grades, List<Integer> credits) {
        this.grades = grades;
        this.credits = credits;
    }

    public double applyCalculation (List<String> grades) {
        //initiate total grade points and total credits
        int totalPoints = 0;
        int totalCredits = 0;

        //loop through each grade by index of i to get the credits and points earned. Add them to get both totalPoints and totalCredits
        for (int i = 0; i<grades.size(); i++) {
            int gradePoint = gradePoints.getOrDefault(grades.get(i), 0);
            int credit = credits.get(i);
            totalPoints += gradePoint * credit;
            totalCredits += credit;
        }

        return (double) totalPoints / totalCredits;

    }
}
