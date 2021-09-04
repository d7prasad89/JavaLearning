package javaFundamentals;

public enum FlightCrewJobEnum {
    FLIGHT_ATTENDANT("Coworker"),
    COPILOT("First Officer"),
    PILOT("Captain");
    String title;

    public String getTitle() {
        return title;
    }

    FlightCrewJobEnum(String title) {
        this.title = title;
    }

}
