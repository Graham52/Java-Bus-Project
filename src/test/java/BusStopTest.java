import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Princes Street", 50);
        person = new Person();
        busStop = new BusStop("Waverley");
    }

    @Test
    public void addPassengerToQueueTest(){
        busStop.addPassengerToQueue(person);
        assertEquals(1, busStop.checkQueue());
    }

    @Test
    public void removePassengerFromQueueTest(){
        busStop.addPassengerToQueue(person);
        assertEquals(1, busStop.checkQueue());
        busStop.removePassengerFromQueue();
        assertEquals(0, busStop.checkQueue());
    }
}