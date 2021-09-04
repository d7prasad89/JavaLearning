package creationalDesignPattern.builder;

import lombok.Builder;

@Builder
public class LombokBuilder {
    private String name;
    private String category;
    private int id;

    @Override
    public String toString() {
        return "LombokBuilder{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", id=" + id +
                '}';
    }
}
