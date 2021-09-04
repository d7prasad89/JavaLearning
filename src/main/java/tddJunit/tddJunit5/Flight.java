package tddJunit.tddJunit5;

import java.util.HashSet;
import java.util.Set;

public abstract class Flight {
    private final int id;
    private final String FlightType;
    private final Set<Passenger> passengerSet = new HashSet<>();
    private int distance;

    public abstract boolean addPassengers(Passenger passenger);

    public Flight(int id, String flightType) {
        this.id = id;
        FlightType = flightType;
    }

    public int getId() {
        return id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getFlightType() {
        return FlightType;
    }

    public Set<Passenger> getPassengerSet() {
        return passengerSet;
    }
}
