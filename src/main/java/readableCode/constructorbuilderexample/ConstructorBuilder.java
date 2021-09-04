package readableCode.constructorbuilderexample;

public class ConstructorBuilder {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .chicken(true)
                .build();
        System.out.println(pizza);
    }
}
