package behavioral.observer;

public class Chairperson implements Observer {
    private String name;

    public Chairperson(String name) {
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println("Chairperson " + name + " notified: " + message);
    }

}