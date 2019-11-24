import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setup() {
        passenger = new Passenger("Adrian", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Adrian", passenger.getName());
    }
    @Test
    public void pasengerHasLuggage(){
        assertEquals(2, passenger.getLuggage());
    }
}
