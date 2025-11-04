package structural.decorator;
import java.util.*;

public class StudentTranscript {
    public static void main(String[] args) {
        //start with the student name and the program
        Student student = new BasicStudent("Sun Kim");
        student = new ProgramDecorator(student, "MS Software Development");

        //add courses taken by the student to each semester so far
        Map<String, List<String>> courses = new HashMap<>();
        courses.put("Fall 2024", Arrays.asList("Algorithms", "Distributed Systems"));
        courses.put("Spring 2025", Arrays.asList("AI", "Machine Learning"));

        //wrap the transcript list and add the courses decorator taken to the transcript
        student = new CoursesDecorator(student, courses);

        //wrap it and add the thesis and the advisor to the transcript
        student = new ThesisDecorator(student, "Optimizing Neural Networks", "Professor Suresh Kalathur ");

        System.out.println(student.getDetails());
    }
}
