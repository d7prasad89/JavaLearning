package defensiveCoding.flights;

import defensiveCoding.model.Flight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightStore {

    List<Flight> flightList = new ArrayList<>();

    public FlightStore() {
        addFlights();
    }

    private void addFlights(){
        Flight chennai = new Flight("chennai", "bangalore", 34, LocalDate.of(2021, 5, 12));
        Flight chennai2 = new Flight("chennai", "bangalore", 12, LocalDate.of(2021, 5, 12));
        Flight bangalore = new Flight("bangalore", "mumbai", 10, LocalDate.of(2021, 5, 12));
        Collections.addAll(this.flightList, chennai, chennai2, bangalore);
    }

    public List<Flight> getFlightList() {
        return this.flightList;
    }

    public boolean hasFlight(LocalDate date) {
        return this.flightList.stream()
                .anyMatch(flight -> flight.getDate().equals(date));
    }


}
