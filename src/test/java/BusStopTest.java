import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before(){
         bus = new Bus("Gorgie Farm");
         busStop = new BusStop("The Park Stop");
    }

    @Test
    public void hasName(){
        assertEquals("The Park Stop", busStop.getName());
    }

    @Test
    public void startsWithEmptyQueue(){
        assertEquals(0, busStop.queueCount());
    }
}
