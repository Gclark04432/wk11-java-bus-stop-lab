import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person1;
    private Person person2;

    @Before
    public void before(){
        bus = new Bus("Gorgie Farm");
    }

    @Test
    public void hasDestination(){
        assertEquals("Gorgie Farm", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bus.checkCapacity());
    }

    @Test
    public void passengersStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkIsSpaceForPassenger(){
        bus.addPassenger(person1);
        assertEquals(true, bus.availableSpace());
    }

    @Test
    public void checkIsNotEnoughSpaceForPassenger(){
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        assertEquals(false, bus.availableSpace());
    }

    @Test
    public void willNotAddPassengerBeyondCapacity(){
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        bus.addPassenger(person1);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger(person2);
        assertEquals(1, bus.passengerCount());
    }
}
