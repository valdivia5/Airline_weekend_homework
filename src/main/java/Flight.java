import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departureAirport;
    private LocalDateTime departureTime;


    public Flight(Plane plane, String number, String destination, String departureAirport, LocalDateTime departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    public int passengerCount() {
        return this.passengers.size();
    }


    public PlaneType getPlaneType() {
        return this.plane.getType();
    }

    public String getFlightNumber() {
        return this.number;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }
    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }
}
