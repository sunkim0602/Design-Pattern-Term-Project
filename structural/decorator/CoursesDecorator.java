package structural.decorator;

import java.util.Map;
import java.util.List;


public class CoursesDecorator extends StudentDecorator {
    //store a map of semesters to lists of courses
    private Map<String, List<String>> semesterCourses;
    //constructor
    public CoursesDecorator(Student student, Map<String, List<String>> semesterCourses) {
        super(student);
        this.semesterCourses = semesterCourses;
    }

    @Override
    //call getDetails from the original student details
    public String getDetails(){
        StringBuilder details = new StringBuilder(super.getDetails());
        //loops through each semester, adding the semester and course list to the details
        for (String semester : semesterCourses.keySet()){
            details.append("\n" + semester + " Courses: " + semesterCourses.get(semester));
        }
        return details.toString();
    }
}
