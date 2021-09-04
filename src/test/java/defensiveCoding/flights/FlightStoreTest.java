package defensiveCoding.flights;

import defensiveCoding.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightStoreTest {

    List<Flight> flights;
    FlightStore flightStore;

    @BeforeEach
    void init() {
        flightStore = new FlightStore();
        flights = flightStore.getFlightList();
    }

    @Test
    public void allowAddingFlights() {
        assertNotNull(flights);
        assertEquals(3, flights.size());
    }

    @Test
    public void returnTrueForHasFlightsIfThereAreFlightsAvailable() {
        assertEquals(flightStore.hasFlight(LocalDate.of(2021, 05, 12)), true);
    }

    @Test
    public void returnFalseHasFlightsIfThereAreNoFlightsAvailable() {
        assertEquals(flightStore.hasFlight(LocalDate.of(2021, 05, 13)), false);
    }

}