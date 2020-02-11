import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 100;
        this.passengers = new ArrayList<Person>();

    }

    public String getDestination() {
        return this.destination;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }
}
