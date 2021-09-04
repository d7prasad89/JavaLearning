package javaFundamentals.database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import tddJunit.database.Database;
import tddJunit.database.DatabaseUtil;
import tddJunit.tddJunit5.Flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTest {
    @Spy
    private Database database;

    private List<List<String>> queriedData;
    private List<Flight> flightList;

    @BeforeEach
    void before() {
        queriedData = new ArrayList<>();
        List<String> row1 = Arrays.asList("1", "e", "Mike", "false", "349");
        List<String> row2 = Arrays.asList("1", "b", "John", "true", "278");
        List<String> row3 = Arrays.asList("1", "e", "Mike", "false", "319");
        queriedData.add(row1);
        queriedData.add(row2);
        queriedData.add(row3);
    }

    @Test
    void testQueriedData() {
        when(database.queryFlightsDatabase()).thenReturn(queriedData);
        flightList = DatabaseUtil.buildFlightsList(queriedData);
        assertEquals(3, database.queryFlightsDatabase().size());
        assertEquals(3, flightList.size());
        assertEquals(315.3333333333333, database.averageDistance(flightList), 0.01);
        assertEquals(278, database.minimumDistance(flightList));
        assertEquals(349, database.maximumDistance(flightList));
    }
}
