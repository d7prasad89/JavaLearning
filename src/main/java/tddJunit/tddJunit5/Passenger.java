package tddJunit.tddJunit5;

import java.util.Objects;

public class Passenger {

    private String name;
    private boolean vipStatus;

    public Passenger(String name, boolean vipStatus) {
        this.name = name;
        this.vipStatus = vipStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(boolean vipStatus) {
        this.vipStatus = vipStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return name.equals(passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
