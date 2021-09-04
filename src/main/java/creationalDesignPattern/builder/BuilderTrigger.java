package creationalDesignPattern.builder;

public class BuilderTrigger {
    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.Builder().bread("wheat").condiments("lettuce").dressing("Mayaoneese").build();
        System.out.println(lunchOrder);
    }
}
