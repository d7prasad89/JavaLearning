package defensiveCoding.flights.service;


import defensiveCoding.flights.FlightStore;
import defensiveCoding.model.Flight;
import defensiveCoding.util.RequestInput;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    FlightStore flightStore;

    public FlightService(FlightStore flightStore) {
        this.flightStore = flightStore;
    }

    public List<Flight> search(RequestInput requestInput) {
        List<Flight> flights = this.flightStore.getFlightList();
        return flights.stream()
                .filter(flight -> flight.getFromDest().equalsIgnoreCase(requestInput.getFrom()))
                .filter(flight -> flight.getToDest().equalsIgnoreCase(requestInput.getTo()))
                .filter(flight -> flight.getDate().equals(requestInput.getDepartDate()))
                .filter(flight -> flight.getSeatsAvailable() > requestInput.getPassengerCount())
                .collect(Collectors.toList());
    }
}
