package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Component
interface CourseComponent {
    //avoid forcing all subclasses to implement in every method and is set as the default
    default void add(CourseComponent courseComponent) {throw new UnsupportedOperationException();}
    default void remove(CourseComponent courseComponent) {throw new UnsupportedOperationException();}
    default CourseComponent getChild(int i) {throw new UnsupportedOperationException();}
    default void display () {throw new UnsupportedOperationException(); }

}

//Leaf
class Course implements CourseComponent {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Course: " + name);
    }
}

//Composite
class ConcentrationComposite implements CourseComponent {
    String name;
    //List is used to store sub concentrations
    ArrayList<CourseComponent> concentrations = new ArrayList<>();

    public ConcentrationComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(CourseComponent component) {
        concentrations.add(component);
    }

    public void remove(CourseComponent component) {
        concentrations.remove(component);
    }


    public void display() {
        System.out.println("Concentration: " + name);
        //while concentration has a sub-concentration, print each course name
        Iterator<CourseComponent> iterator = concentrations.iterator();
        while (iterator.hasNext()) {
            CourseComponent concentration = (CourseComponent) iterator.next();
            concentration.display();
        }
    }
}