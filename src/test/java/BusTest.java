import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Gorgie Farm");
    }

    @Test
    public void hasDestination(){
        assertEquals("Gorgie Farm", bus.getDestination());
    }
}
