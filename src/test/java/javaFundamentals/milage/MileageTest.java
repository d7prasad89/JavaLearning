package javaFundamentals.milage;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import tddJunit.mileage.FlightArgumentConverter;
import tddJunit.mileage.Mileage;
import tddJunit.tddJunit5.Flight;
import tddJunit.tddJunit5.Passenger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MileageTest {

    private Mileage mileage;

    @BeforeAll
    void beforeAll() {
        mileage = new Mileage();
    }

    @ParameterizedTest
    @Disabled
    @ValueSource(strings = {"1; e; Mike; false; 349", "2;b;John; true; 278"})
    void checkGivenPoints(@ConvertWith(FlightArgumentConverter.class) Flight flight) {
        for(Passenger passenger: flight.getPassengerSet()) {
            mileage.addMileage(passenger, flight.getDistance());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/flights_information.csv")
    void checkGivenPointsWithCSVInput(@ConvertWith(FlightArgumentConverter.class) Flight flight) {
        for(Passenger passenger: flight.getPassengerSet()) {
            mileage.addMileage(passenger, flight.getDistance());
        }
    }

    @AfterAll
    void afterAll() {
        mileage.calculateGivenPoints();
        assertEquals(17, mileage.getPassengerPointsMap().get(new Passenger("Mike", false)).intValue());
        assertEquals(27, mileage.getPassengerPointsMap().get(new Passenger("John", true)).intValue());
        System.out.println(mileage.getPassengerPointsMap());
    }
}