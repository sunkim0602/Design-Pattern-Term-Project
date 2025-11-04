package behavioral.observer;

public class Student implements Observer {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update (String message) {
        System.out.println("Student " + name + " notified: " + message + ". Subscribed to enrollment notification.");

    }
}


