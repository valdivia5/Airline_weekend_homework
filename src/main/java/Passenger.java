public class Passenger {
    private String name;
    private int luggage;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int luggage) {
        this.name = name;
        this.luggage = luggage;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLuggage() {
        return this.luggage;
    }
}
