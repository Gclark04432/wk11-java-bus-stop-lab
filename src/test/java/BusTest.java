import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person1;

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
        assertEquals(100, bus.checkCapacity());
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
}
