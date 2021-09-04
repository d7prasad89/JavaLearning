package javaFundamentals.airport;

import org.junit.jupiter.api.*;
import tddJunit.tddJunit5.EconomyFlight;
import tddJunit.tddJunit5.Flight;
import tddJunit.tddJunit5.Passenger;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @Nested
    @DisplayName("Given there is an economy flight")
    static
    class EconomyFlightTest {
        private static Flight economyFlight;
        private static Passenger mike;
        private static Passenger mike2;
        private static Passenger john;

        @BeforeAll
        static void setUp() {
            economyFlight = new EconomyFlight(1, "Economy");
            mike = new Passenger("Mike", false);
            mike2 = new Passenger("Mike2", false);
            john = new Passenger("John", true);
        }

        @Nested
        @DisplayName("When we have an Usual passenger")
        class UsualPassenger {
            @Test
            @DisplayName("Then we can add him to Economy flight")
            public void testEconomyFlightUsualPassenger() {
                assertEquals(true, economyFlight.addPassengers(mike2));
                assertEquals(2, economyFlight.getPassengerSet().size());
            }

            @DisplayName("Then we cannot add him multiple times")
            @RepeatedTest(5)
            public void testEconomyFlightPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for(int i=0; i< repetitionInfo.getCurrentRepetition(); i++) {
                    economyFlight.addPassengers(mike);
                }
                assertAll("Verify a usual passenger can be added to an economy flight only once",
                        () -> assertEquals(1, economyFlight.getPassengerSet().size()),
                        () -> assertTrue(economyFlight.getPassengerSet().contains(mike)),
                        //() -> assertTrue(economyFlight.getPassengerSet().iterator().next().getName().equals("Mike")));
                        () -> assertTrue(new ArrayList<>(economyFlight.getPassengerSet()).get(0).getName().equals("Mike")));
            }

        }

        @Nested
        @DisplayName("When we have an VIP passenger")
        class VIPPassenger {
            @Test
            @DisplayName("Then we cannot add him to Economy flight")
            public void testEconomyFlightUsualPassenger() {
                assertEquals(false, economyFlight.addPassengers(john));
                assertEquals(0, economyFlight.getPassengerSet().size());
            }
        }
    }
}