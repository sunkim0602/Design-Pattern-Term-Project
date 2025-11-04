package creational.builder;

import java.util.ArrayList;

//define the steps to build the object (Product class)
interface Builder {
    void getName();
    void getDescription();
    void getSyllabus();
    void getInstructor();
    int getEnrollmentLimit();
    String format();

    Course getCourse();
}

//Product class - MET665 course with details & instructions
class METCS665Builder implements Builder{
    private Course course;
    public METCS665Builder() {course = new Course(); }
    public void getInstructor() {course.add("Instructor: Suresh Kalathur"); }
    public void getName() {course.add("Name: METCS665"); }
    public void getDescription() {course.add("Description: Software Design"); }
    public void getSyllabus() {course.add("Syllabus: Assignments, Discussion Topics, Term Project, Final"); }
    public int getEnrollmentLimit() {return 100;}
    public String format() {return "HTML";}
    public Course getCourse() {return course;}
}

//Product class - MET602 course with details & instructions
class METCS602Builder implements Builder{
    private Course course;
    public METCS602Builder() {course = new Course(); }
    public void getName() {course.add("Name: METCS602"); }
    public void getDescription() {course.add("Description: Server-Side Web Development"); }
    public void getSyllabus() {course.add("Syllabus: Assignments, Discussion Topics, Term Project, Final"); }
    public void getInstructor() {course.add("Instructor: Suresh Kalathur"); }
    public int getEnrollmentLimit() {return 100;}
    public String format() {return "HTML";}
    public Course getCourse() {return course;}
}

//store the details of the course in a list
class Course{
    //initialize a list and add details to the list one by one
    private final ArrayList<String> details;
    public Course(){ details = new ArrayList<>();}
    public void add(String detail) {details.addLast(detail);}
    //print method
    public void showCourse(){
        System.out.println("\nCourse details: ");
        for (String detail : details)
            System.out.println(detail);
    }
}

//Use the director class and the construct method to build the sequence based on each course
class Director{
    Builder builder;
    public void construct(Builder builder){
        this.builder = builder;
        builder.getName();
        builder.getDescription();
        builder.getSyllabus();
        builder.getInstructor();
        builder.getEnrollmentLimit();
        builder.getCourse();

    }
}

public class CourseBuilder{
    public static void main(String[] args) {
        Director director = new Director(); //initialize the director

        //Creating METCS665 course
        Builder MET665Builder = new METCS665Builder();
        director.construct(MET665Builder);
        Course course1 = MET665Builder.getCourse();
        course1.showCourse();

        //Creating METCS602 course
        Builder MET602Builder = new METCS602Builder();
        director.construct(MET602Builder);
        Course course2 = MET602Builder.getCourse();
        course2.showCourse();
    }

}
