package behavioral.strategy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class CalculationMethods {
    //create a Hash map with each grade and matching numeral values
    public static final Map<String, Integer> gradePoints = new HashMap<>();
    static {
        gradePoints.put("A", 4);
        gradePoints.put("B", 3);
        gradePoints.put("C", 2);
        gradePoints.put("D", 1);
        gradePoints.put("F", 0);
    }
    public abstract double applyCalculation(List<String> grades);
}
