package javaFundamentals;

public class CrewMember {
    FlightCrewJobEnum job;
    String name;

    public CrewMember(FlightCrewJobEnum job, String name) {
        this.job = job;
        this.name = name;
    }

    public FlightCrewJobEnum getJob() {
        return job;
    }

    public void setJob(FlightCrewJobEnum job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
