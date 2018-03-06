import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

        Bus bus;
        Person  person;
        BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Princes Street", 50);
        person = new Person();
        busStop = new BusStop("Haymarket");
    }

    @Test
    public void passengersInBusTest(){
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void addPassengerToBusTest(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    public void removePassengerFromBusTest(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengersCount());
        bus.removePassenger();
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void pickUpPassengerTest(){
        busStop.addPassengerToQueue(person);
        bus.pickupPassenger(busStop);
        assertEquals(1,bus.passengersCount());
        assertEquals(0,busStop.checkQueue());
    }
}
