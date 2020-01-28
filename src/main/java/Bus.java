import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if (countPassengers()< capacity){
        this.passengers.add(person);}
    }

    public void removePerson() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
        Person cattle = busStop.removePersonFromQueue();
        addPerson(cattle);
    }
}
