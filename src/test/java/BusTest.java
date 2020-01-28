import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Howich", 3);
        person = new Person();
        busStop = new BusStop("Queen Street");
        ArrayList<Person> passengers = new ArrayList<>();
        passengers.add(person);
    }

    @Test
    public void passengersStartsEmpty(){
        assertEquals( 0, bus.countPassengers());
    }

    @Test
    public void canAddPersonToBus(){
        bus.addPerson(person);
        assertEquals(1, bus.countPassengers() );
    }

    @Test
    public void rejectPersonDueToCapacity(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(3, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickUpPassengerFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, busStop.countQueue());
        assertEquals(1, bus.countPassengers());
    }


}
