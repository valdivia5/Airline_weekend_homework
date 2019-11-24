import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Passenger passenger1;
    LocalDateTime time;

    @Before
    public void before() {
        time = LocalDateTime.parse("2019-11-24T01:00");
        plane = new Plane(PlaneType.AIRBUSBELUGA);
        flight = new Flight(plane, "EZY9565", "SHANGAI", "EDINVRA", time);
        passenger1 = new Passenger("Chacho Morales", 1);
    }

    @Test
    public void passengersStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.AIRBUSBELUGA, flight.getPlaneType());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("EZY9565", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("SHANGAI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDINVRA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals(LocalDateTime.parse("2019-11-24T01:00"), flight.getDepartureTime());
    }

}
