package creational.factory;

public abstract class Programs {
    String name;
    String description;
    String courses;
    String duration;

    public void getCoreCourses () {System.out.println(name + "requires taking the following courses: ");}
    public void getElectives () {System.out.println(name + "requires taking the following electives:");}
    public String getDuration () {
        return ("Program duration requirement: " + duration); }
    public String getDescription () {
        return ("Program degree declared: " + description);   }

}
