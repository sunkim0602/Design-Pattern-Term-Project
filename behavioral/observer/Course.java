package behavioral.observer;

import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class Course implements Subject {
    private String name;
    private int capacity;
    //store people who's subscribed to the notifications in a list
    private List <Observer> observers = new LinkedList<>();
    //store students in a waitlist for a course
    private Queue <Student> waitlist = new LinkedList<>();
    //store students enrolled in a course into a list
    private List <Student> enrolled = new LinkedList<>();

    //Constructor
    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //Method to allow students to enroll if the size is not at capacity.
    public void enrollStudent(Student student){
        if (enrolled.size() < capacity) {
            enrolled.add(student);
            System.out.println("Enrolled " + student.getName() + " in " + name);
        } else{
            //If at capacity, send out notification to the subscribers
            System.out.println("Course full. " + student.getName() +" added to waitlist for " + name);
            waitlist.add(student);
            //student in the waitlist subscribed to notifications for changes in the course enrollment
            registerObserver(student);
            notifyObservers("Enrollment full for course - " + name);
        }
    }
    //Method if a student drops a class, notify to subscribers of the course opening
    public void dropStudent(Student student){
        if (enrolled.remove(student)) {
            System.out.println(student.getName() + " dropped from " + name);
            notifyObservers("Enrollment seat available for course - " + name);
            //if there are students in the waitlist, enroll the next student on the list. Remove from the waitlist and enroll them to the course
            if (!waitlist.isEmpty()) {
                Student nextWaiting = waitlist.poll();
                enrolled.add(nextWaiting);
                System.out.println(nextWaiting.getName() + " has been enrolled in " + name + " from waitlist.");
                //unsubscribe the student from notifications
                removeObserver(nextWaiting);
            } else {
                waitlist.remove(student);
                System.out.println(student.getName() + " removed from " + name);
            }
        } else{
            System.out.println(student.getName() + " is not enrolled in " + name);
        }
    }

    public String getName(){
        return name;
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message){
        for (Observer observer : observers){
            observer.update (message);
        }
    }
}

