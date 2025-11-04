package behavioral.observer;

public class Notification {
    public static void main(String[] args) {
        //instantiate course, chairperson, and students
        Course course1 = new Course("Software Design and Patterns", 4);
        Chairperson chairperson = new Chairperson ("Professor Kalathur");
        //register Professor Kalathur as the observer and subscribe him to notifications
        course1.registerObserver(chairperson);

        Student student1 = new Student ("Sun Kim");
        Student student2 = new Student ("Tiffany Johnson");
        Student student3 = new Student ("John Smith");
        Student student4 = new Student ("Jose Garcia");
        Student student5 = new Student ("David Wong");

        //enroll students into the course
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);
        course1.enrollStudent(student4);
        course1.enrollStudent(student5);

        //drop the third student and have the student in the waitlist to be enrolled
        course1.dropStudent(student3);

    }
}
