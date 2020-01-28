import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        //ArrayList<Person> queue = new ArrayList<>();
        person = new Person();
//        queue.add(person);
//        queue.add(person);
//        queue.add(person);
        busStop = new BusStop("Queen Street");
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void canAddPersonToQueue(){
        this.busStop.addPersonToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        this.busStop.addPersonToQueue(person);
        this.busStop.addPersonToQueue(person);
        Person returnedPerson = this.busStop.removePersonFromQueue();
        assertEquals(1, busStop.countQueue());
        assertNotNull(returnedPerson);
    }



}
